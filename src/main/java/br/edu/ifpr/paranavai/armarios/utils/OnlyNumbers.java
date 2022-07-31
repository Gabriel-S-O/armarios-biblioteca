/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Yago Macinelli
 */
public class OnlyNumbers extends PlainDocument {
    
    @Override
    public void insertString(int offs, String input, AttributeSet attribute) throws BadLocationException {
        super.insertString(offs, input.replaceAll("[^0-9]", ""), attribute);
    }
}
