package excepciones;

public class Test { 
	
  public static void main(String a[]) {
	  
    Cuenta c = new Cuenta(5000);
    
    System.out.println("Saldo: " + c.getSaldo());
    
    
    try { 
      c.sacarDinero(60000); 
    }
    catch(NoHayDineroException e) { 
      System.out.println("Te has pasado en " + e.getDinero());
      System.out.println(e.getMessage());
    } 
    finally {
    	
    	System.out.println("Fin de la operacións sacar dinero");
    }
    
    System.out.println("Saldo: " + c.getSaldo());
  } 

} 