package no11.Exception;

class ExceptionEx12 {
	public static void main(String args[]) {
		System.out.println(1);		// �������� ae�� ����, ������ ArithmeticException�ν��Ͻ��� ������ �� �ִ�.	
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // ���ܹ߻�!!!
			System.out.println(4); 	 // ������� �ʴ´�.
		} catch (ArithmeticException ae)	{
			ae.printStackTrace();
			System.out.println("���ܸ޽��� : " + ae.getMessage());
		}	// try-catch�� ��
		System.out.println(6);
	}	// main�޼����� ��
}