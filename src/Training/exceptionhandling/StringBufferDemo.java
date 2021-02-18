package Training.exceptionhandling;

class StringBufferDemo {
    /** Constructor. */
    protected StringBufferDemo() {
    }
    public static void main(final String []args) {

    StringBuffer buf = new StringBuffer("Java");
    buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
    buf.append(7);
    int index = 5;   // Insert  // Java Student Guide Ver1/7 
    buf.insert(index, "Student ");                               
    index = 23;      // Set  // Java Student Guide Ver1.7
    buf.setCharAt(index, '.');                                    
    int start = 24;   // Replace  // Java Student Guide Ver1.8
    int end = 25;
    buf.replace(start, end, "8");                                
    String s = buf.toString();   //Convert to string
    System.out.println(s);
    }

		private void replace(int start, int end, String string) {
			// TODO Auto-generated method stub
			
		}
		private void append(String string) {
			// TODO Auto-generated method stub
			
		}
		private void insert(int index, String string) {
			// TODO Auto-generated method stub
			
		}
		private void setCharAt(int index, char c) {
			// TODO Auto-generated method stub
			
		}
}
