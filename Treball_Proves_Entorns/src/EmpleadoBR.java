public class EmpleadoBR {  
  
    public static float calculaSalarioBruto (TipoEmpleado tipo, float ventasMes, float horasExtra) throws BRException{
        float salarioBruto = 0;
        
        if(tipo == null || ventasMes < 0 || horasExtra < 0)
            throw new BRException ();
        
        
        if(tipo == TipoEmpleado.vendedor)
            salarioBruto = 1000;
        
        
        if(tipo == TipoEmpleado.encargado)
            salarioBruto = 1500;
        
        
        if(ventasMes >= 1000 && ventasMes < 1500)
            salarioBruto += 100;
               
        if(ventasMes >= 1500)
            salarioBruto += 200;
        
        
        salarioBruto += (horasExtra * 20);
        
        return salarioBruto;
    }

    public static float calculaSalarioNeto (float salarioBruto) throws BRException{
        
        if(salarioBruto < 0)
            throw new BRException ();
        
        if(salarioBruto < 1000)
            return salarioBruto;
        
        if(salarioBruto >= 1000 && salarioBruto < 1500)
            return salarioBruto -= (salarioBruto * 0.16);
        else
            return salarioBruto -= (salarioBruto * 0.18);     
    }
    
}
