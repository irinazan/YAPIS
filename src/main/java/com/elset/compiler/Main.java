package com.elset.compiler;

import com.elset.compiler.core.ElsetLanguageParserV1;
import com.elset.compiler.core.ElsetLanguageVisitorImplV1;
import com.elset.compiler.gen.ElsetLanguageLexer;
import com.elset.compiler.gen.ElsetLanguageVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream("src/main/resources/test.elset"));
            ElsetLanguageLexer lexer = new ElsetLanguageLexer(input);
            ElsetLanguageParserV1 parser = new ElsetLanguageParserV1(new CommonTokenStream(lexer));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ParseTree tree = parser.global_program();
         
            CharStream inputStream = null;
                try {
                inputStream = CharStreams.fromFileName("src/main/resources/coroutine_test.elset");
                } catch (IOException e) {
                e.printStackTrace();
            }  
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Lexer error: " + byteArrayOutputStream.toString());
                return;
            }
            ElsetLanguageVisitor<String> listVisitor = new ElsetLanguageVisitorImplV1(parser, "RunProgram");
            String output = listVisitor.visit(tree);
            FileWriter fileWriter = new FileWriter("RunProgram.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
