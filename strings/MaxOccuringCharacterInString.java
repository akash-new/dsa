public static void main(String args[]) {
		String str = "Youtube is addictive. Github is cool. Let's go!";
		
		int[] charCount = new int[26];
		
		for(int i=0;i<str.length();i++) {
			charCount[str.charAt(i) - 'a']++;
		}
		
		int max =Integer.MIN_VALUE;
		char ch = 'a';
		for(int i=0;i<26;i++) {
			if(charCount[i]>max) {
				ch = (char)(i+97);
				max = charCount[i];
			}
		}
		
		System.out.println(max);
		System.out.println(ch);
}
