/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciarSenha;

/**
 *
 * @author Familia
 */
public class Criptografia {

    public static String criptografar(String senha) {
        char[] vetorSenha = senha.toCharArray();
        senha = "";
        for (int i = 0; i < vetorSenha.length; i++) {
            char caracter = vetorSenha[i];
            caracter += 1;
            vetorSenha[i] = caracter;
            senha += vetorSenha[i];
        }
        return senha;
    }

    public static String descriptografar(String senha) {
        char[] vetorSenha = senha.toCharArray();
        senha = "";
        for (int i = 0; i < vetorSenha.length; i++) {
            char caracter = vetorSenha[i];
            caracter -= 1;
            vetorSenha[i] = caracter;
            senha += vetorSenha[i];
        }
        return senha;
    }
}
