/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.service;

/**        
 * 
 * 
 *
 * @author Aluno
 */
public class LoginService {
    
    public static String verifica(String ra, String senha){
       if (ra.equals("20220012345")){
           if (senha.equals("12345")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "RA inválido!";         
    }
    
    public static String verificaCPF(String cpf, String senha){
       if (cpf.equals("000.000.000-00")){
           if (senha.equals("12345")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "CPF inválido!";         
    }
    
}
