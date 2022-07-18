package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.exceptions.NullCpfException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullPasswordException;
import br.edu.ifpr.paranavai.armarios.exceptions.NullRaException;
import br.edu.ifpr.paranavai.armarios.model.Estudante;

/**        
 * 
 * 
 *
 * @author Aluno
 */
public class LoginService {
    
    Estudante estudante = new Estudante();
    
    public static String verifica(String ra, String senha) throws NullRaException, NullPasswordException{
        
        if(ra == null){ 
            throw new NullRaException();
        }
        
        if(senha == null){
            throw new NullPasswordException();
        }
        
       if (ra.equals("20220012345")){
           if (senha.equals("12345")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "RA inválido!";         
    }
    
    public static String verificaCPF(String cpf, String senha) throws NullCpfException, NullPasswordException{
        
        if(cpf == null){ 
            throw new NullCpfException();
        }
        
        if(senha == null){
            throw new NullPasswordException();
        }
        
       if (cpf.equals("000.000.000-00")){
           if (senha.equals("12345")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "CPF inválido!";         
    }
    
}
