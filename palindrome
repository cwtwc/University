# First SPIM Assignment
	# Program 1
	# Name: Wein Wong
	# Class: CDA3101
	# Date: January 30, 2015
###################################################################################
# Transform the following code snippet into MIPS instructions:
	# int num, reverse = 0, temp;
	# 
	# printf("Programming assignment 1 for CDA3101\n");
	# printf("This palindrome checker only deals with positive integer number.\n");
	# printf("Enter a number to check if it is a palindrome or not.\n");
	# scanf("%d",&num);
	# 
	# temp = num;
	# 
	# while( temp != 0 )
	# {
	#	reverse = reverse * 10;
	#	reverse = reverse + temp%10;
	#	temp = temp/10;
	# }
	# 
	# if ( num == reverse )
	#	printf("%d is a palindrome number.\n", num);
	# else
	#	printf("%d is not a palindrome number.\n", num);
###################################################################################
# Data declarations
.data
num: .word 0				# Entered integer
reverse: .word 0			# Reverse of entered integer
temp: .word 0				# Holds temporary data
remainder: .word 0 			# Represents temp%10
str1: .asciiz "Programming assignment 1 for CDA3101\nThis palindrome checker only deals with positive integer number.\nEnter a number to check if it is a palindrome or not.\n"
str2: .asciiz " is a palindrome number."
str3: .asciiz " is not a palindrome number."

.text
main:
	# Prints introduction and prompts user to enter input
	la $a0, str1			# Load str1 address to $a0 and I/O code to $v0
	li $v0, 4
	syscall 				# Perform input/output from console
	# Obtains user's input		
	li $v0, 5 				# I/O sequence to read integer from console
	syscall
	# temp = num;
	sw $v0, num 			# Store contents of $v0 into num
	lw $t0, num 			# Load word at num to $t0
	sw $t0, temp 			# Store contents of $t0 into temp	
# while( temp != 0)
while:
	lw $t0, temp 		   	# Load word at temp to $t0
	# temp%10
	rem $t1, $t0, 10		# Compute remainder of integer division, represented by $t1
	sw $t1, remainder		# Store contents of $t1 into remainder
	lw $t2, reverse 		# Load word at reverse to $t2
	# reverse = reverse * 10
	mul $t0, $t2, 10 
	lw $t1, remainder 		# Load word at remainder to $t1
	# reverse = reverse + temp%10
	add $t3, $t0, $t1
	sw $t3, reverse 		# Store contents of $t3 into reverse
	lw $t2, temp 			# Load word at temp to $t2
	# temp = temp/10;
	div $t2, $t2, 10
	sw $t2, temp 			# Store contents of $t2 into temp
	lw $t2, temp 			# Load word at temp to $t2
	bne $t2, 0, while		# Go back to beginning of while loop
	lw $t2, num 			# Load word at num to $t2
	lw $t0, reverse 		# Load word at reverse to $t0
	bne $t2, $t0, else		# If num != reverse then go to else, otherwise continue to if
if:
	# Output for user: input is a palindrome number
	li  $v0, 1 	 			# I/O sequence to read an integer from console
	move $a0, $t2  			# Place input read into $a0
	syscall 				# Perform input/output from console
	la $a0, str2 			# Load str2 address to $a0 and I/O code to $v0
	li $v0, 4
	syscall 				# Perform input/output from console
	jr $ra			 		# Return to caller
else:
	# Output for user: input is not a palindrome number
	li  $v0, 1 	 			# I/O sequence to read an integer from console
	move $a0, $t2  			# Place input read into $a0
	syscall 				# Perform input/output from console
	la $a0, str3 			# Load str3 address to $a0 and I/O code to $v0
	li $v0, 4
	syscall 				# Perform input/output from console
	jr $ra 					# Return to caller
