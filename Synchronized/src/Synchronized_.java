package Synchronized.src;

class isMe {
	public synchronized void doSth() {
		try {
			for (int i =1;i <=5 ;i++ ) {
				System.out.println("Stand" +i);
				Thread.sleep(100);
			}
			}catch (InterruptedException ie) {
				System.out.println("Who woke me?");
			}
		}
	}

class Testing extends Thread {
	isMe m;
	Testing(isMe m) {
		this.m= m;

	}

	@Override
	public void run() {
		m.doSth();
	}
}

class Synchronized_ {
	public static void main(String[] args) {
		isMe m = new isMe();
		Testing t = new Testing(m);
		Testing t1 = new Testing(m);
		t.start();
		t1.start();
	}
}