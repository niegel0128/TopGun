package no00;
//2015.12.29(6)
public class SpecialChar 
{
	public static void main(String[] args)
	{
		char single 	= '\''; 			//µû¿ÈÇ¥ Ç¥½Ã. ''' ¿Í °°ÀÌ Ç¥½ÃÇÒ¼ö ¾ø¾î¼­ ÅÇÀ» ¾¸
		String dblquote = " \"Hello\" ";	//°ã µû¿ÈÇ¥¸¦ Ãâ·ÂÇÒ¶§
		String root 	= "c:\\";			//ÅÇÀ» Ç¥½ÃÇÒ¶§
		
		System.out.println(single);
		System.out.println(dblquote);
		System.out.println(root);
	}
}
