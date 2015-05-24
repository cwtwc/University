# Second SPIM Assignment
	# Program 2
	# Name: Wein Wong
	# Class: CDA3101
	# Date: February 10, 2015
################################################################################
# Transform the following code snippet into MIPS instructions:
# Assumed that the two inputs are positive integers except 0.
	# // Calculates the greatest common divisor
	# int gcd(int number1, int number2) {
	#	int remainder = number1 % number2;
	#	if (remainder == 0) {
	#		return number2;
	#	}
	#	else {
	#		return gcd(number2, remainder);
	#	}
	# }
	# // Calculates the least common multiple
	# int lcm(int number1, int number2) {
	#	return number1*number2 / gcd(number1, number2);
	# }
	#
	# int main()
	# {
	#	int n1, n2;
	#	printf("Enter first integer n1: ");
	#	scanf("%d", &n1);
	#	printf("Enter second integer n2: ");
	#	scanf("%d", &n2);
	#	printf("The greatest common divisor of n1 and n2 is %d\n", gcd(n1, n2));
	#	printf("The least common multiple of n1 and n2 is %d\n", lcm(n1, n2));
	#	return 0;
	# }
################################################################################
# Data declarations
.data
	str1: .asciiz "Enter first integer n1: "
	str2: .asciiz "Enter second integer n2: "
	str3: .asciiz "The greatest common divisor of n1 and n2 is "
	str4: .asciiz "The least common multiple of n1 and n2 is "
	newline: .asciiz "\n"
.text

main:
	# Prompts user to enter first input
	la $a0, str1 			# Load str1 address to $a0 and I/O code to $v0
	li $v0, 4
	syscall 				# Perform input/output from console
	# Obtains user's first input		
	li $v0, 5 				# I/O sequence to read integer from console
	syscall
	move $a1, $v0 			# Move value of input to $a0 number1
	# Prompts user to enter second input
	la $a0, str2			# Load str2 address to $a0 and I/O code to $v0
	li $v0, 4
	syscall 				# Perform input/output from console
	# Obtains user's second input		
	li $v0, 5 				# I/O sequence to read integer from console
	syscall 				# Perform input/output from console
	move $a2, $v0 			# Move value of input to $a2 number2
	# Call gcd
	jal	gcd
	# Prints str3 to indicate output is greatest common divisor of 2 integers
	la $a0, str3
	li $v0, 4
	syscall
	# Prints gcd(n1, n2) and new line character
	jal print
	# Call lcm
	jal	lcm
	# Prints str4 to indicate output is least common multiple of 2 integers
	la $a0, str4
	li $v0, 4
	syscall
	# Prints lcm(n1, n2) and new line character
	jal print
	# Ends program
	j end

gcd:
	addi $sp, $sp, -16 		# Adjust stack
	sw $ra, 0($sp)			# Save return address
	sw $a1, 4($sp)			# Save number1 into $a1
	sw $a2, 8($sp)			# Save number2 into $a2
	rem $s0, $a1, $a2 		# remainder = number1 % number2
	sw $s0, 12($sp) 		# Save remainder into $s0
	bne	$s0, $zero,	else 	# Else statement if remainder != 0
	move $v1, $a2 			# Move value of $a2 number2 to $v1 for output 
	lw $ra, 0($sp) 			# Restore return address
	addi $sp, $sp, 16		# Pop items from stack
	jr $ra 					# Return

else:
	lw $a1, 8($sp) 			# Value in 8($sp) number2 passed to $a1 number2
	lw $a2, 12($sp) 		# Value in 12($sp) remainder passed to $a2 number2
	jal	gcd 				# Call gcd
	lw $a1, 4($sp)			# Restore $a1
	lw $a2, 8($sp)			# Restore $a2
	lw $ra, 0($sp)			# Restore return address
	addi $sp, $sp, 16		# Pop items from stack
	jr $ra 					# Return

lcm:
	addi $sp, $sp, -16		# Adjust stack
	sw $ra, 0($sp)			# Save return address
	sw $s0, 4($sp)			# Save local variable
	sw $a1, 8($sp)			# Save number1 into $a1
	sw $a2, 12($sp)			# Save number2 into $a2
	jal gcd 				# Call gcd
	move $s0, $v1 			# Move return value of $v1 to $s0
	lw $a1, 8($sp) 			# Restore $a1
	lw $a2, 12($sp) 		# Restore $a2
	mul $a1, $a1, $a2 		# number1*number2
	div $a1, $a1, $s0		# number1*number2 / gcd(number1, number2)
	move $v1, $a1 			# Move value of $a1 to $v1 for output 
	lw $ra, 0($sp)			# Restore return address
	lw $s0, 4($sp)			# Restore $s0
	addi $sp, $sp, 16		# Pop items from stack
	jr $ra					# Return

print:	
	# Prints answers for gcd and lcm
	li $v0, 1 				# I/O sequence to read an integer from console
	move $a0, $v1 			# Move value of $v1 to $a0
	syscall 				# Perform input/output from console
	# Prints new line character
	la $a0, newline
	li $v0, 4
	syscall
	jr $ra 					# Return

end:
	addi $v0, $zero, 1		# Return 0 to $v0
	li $v0, 10				# End program
	syscall
