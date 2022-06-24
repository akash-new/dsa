// Josephus circle - https://practice.geeksforgeeks.org/problems/linkedlist-josephus-circle/0/?track=cip-linkedlist&batchId=238

public static int josephus(int n, int k)
{
    LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=0;i<n;i++)
        {
            list.add(i);
        }
        
    ListIterator<Integer> litr = list.listIterator();
		while(list.size()>1) {
			for(int i=0;i<k;i++) {
				if(litr.hasNext()) {
					litr.next();
				} else {
					litr=list.listIterator();
					litr.next();
				}
			}
			litr.remove();
		}
        return list.peek();
}
