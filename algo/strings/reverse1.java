	/**
	 * check if input2 is reversed input1.
	 * 
	 * Ex.  abc, cba => IS REVERSED, but abc, cab => IS NOT
	 */
	void solution() {
		Scanner sc = new Scanner(System.in); 	
	
		for(;;) {
			boolean isReversed = true;
			
			System.out.println("Input 2 strings (with equal length > 1):");
			String input1 = sc.next();
			sc.nextLine(); // consume end-of-line
			String input2 = sc.next();	
			
			if (input1.length() != input2.length()) {
				System.out.println("NOT REVERSED - dif len");
				continue;
			}
			
			if ((input1.length() == 1) && (input2.length()==1)) {
				System.out.println("Special case detected - two chars...");
				continue;
			}
			
			
			for (int i = 0; i < input1.length() - 1; i++) {
				if (input1.charAt(i) != input2.charAt(input2.length() -1 - i)) {
					isReversed = false;
					System.out.println("NOT REVERSED");
					continue;
				}
			}
			
			System.out.println("IS REVERSED");
			
		}
	}
