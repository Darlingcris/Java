import java.awt.Dimension;
 
public class ResolucaoTela {
  public static void main(String [] args) {
      Toolkit tk= Toolkit.getDefaultToolkit();
      Dimension di= tk.getScreenSize();
      System.out.println ("A resolução do sistema é: ",di.width, " x ",di.height);
  }
}

