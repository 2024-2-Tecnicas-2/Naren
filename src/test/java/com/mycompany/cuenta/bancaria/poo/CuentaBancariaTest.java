package com.mycompany.cuenta.bancaria.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;





public class CuentaBancariaTest {
   public CuentaBancariaTest() {
   @Test
    public void testGetTitular() {
        String valor_esperado = "Marcos";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Marcos");
        String valor_actual = cuenta.getTitular();
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void testGetTitular2() {
        String valor_esperado = "Pedro";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Pedro");
        String valor_actual = cuenta.getTitular();
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void testgetNumeroCuenta(){
        String valor_esperado = "4888lk";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("4888lk");
        String valor_actual = cuenta.getNumeroCuenta();
        assertEquals(valor_esperado,valor_actual); 
        
    }
    
    @Test
    public void testgetNumeroCuenta2(){
        String valor_esperado = "508222219t";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("508222219t");
        String valor_actual = cuenta.getNumeroCuenta();
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void  testgetSaldo(){
        double valor_esperado = 2;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(2);
        double valor_actual = cuenta.getSaldo();
        assertEquals(valor_esperado,valor_actual);
        
    }
    
    @Test
    public void testgetSaldo2(){
        double valor_esperado = 500;
        
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(500);
        double valor_actual = cuenta.getSaldo();
        assertEquals(valor_esperado,valor_actual);
        
    }
    
    @Test
    public void testingresar(){
        double valor_esperado = 232710-500;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(232710);
        
   
        double valor_actual = cuenta.retirar(500);
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void testingresar2(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(100);
        
   
        double valor_actual = cuenta.retirar(500);
        assertEquals(0,valor_actual);
        
        
    }
    
    @Test
    public void testcalcularInteres() {
        
        double valor_esperado = 506*0.015;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(506);
   
        double valor_actual = cuenta.calcularInteres();
        assertEquals(valor_esperado,valor_actual);
        
        
        
    }
    
    @Test
    public void testcalcularInteres2() {
        
       
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(-506);
   
        double valor_actual = cuenta.calcularInteres();
        
        
        assertEquals(0,valor_actual);
        
        
        
        
    }
    @Test
    public void testsetTipoInteres() {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        double valor_esperado = 0.10;
        cuenta.setTipoInteres(0.10);
        double valor_actual = cuenta.getTipoInteres();
        
        assertEquals(valor_esperado, valor_actual );
        
    }
    @Test
    public void testsetTipoInteres2() {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        cuenta.setTipoInteres(-0.10);
        double valor_actual = cuenta.getTipoInteres();
        
        assertEquals(0.015, valor_actual );
        
    }
}
