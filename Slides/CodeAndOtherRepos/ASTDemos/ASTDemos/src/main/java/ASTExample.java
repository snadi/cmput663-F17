/**
 * Created by snadi on 2017-09-11.
 */

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;


public class ASTExample {
    public static void main(String args[]){
        ASTParser parser = ASTParser.newParser(AST.JLS3);
        String content = null;
        try {
            content = FileUtils.readFileToString(new File(ASTExample.class.getClassLoader().getResource("test.java").getFile()), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            content = new Scanner(new FileInputStream(ASTExample.class.getClassLoader().getResourceAsStream("test.java")).useDelimiter("\\Z").next();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        parser.setSource(content.toCharArray());
        //parser.setSource("/*abc*/".toCharArray());
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        //ASTNode node = parser.createAST(null);


        final CompilationUnit cu = (CompilationUnit) parser.createAST(null);

        cu.accept(new ASTVisitor() {

            Set names = new HashSet();

            public boolean visit(VariableDeclarationFragment node) {
                SimpleName name = node.getName();
                this.names.add(name.getIdentifier());
                System.out.println("Declaration of '"+name+"' at line"+cu.getLineNumber(name.getStartPosition()));
                return false; // do not continue to avoid usage info
            }

            public boolean visit(SimpleName node) {
                if (this.names.contains(node.getIdentifier())) {
                    System.out.println("Usage of '" + node + "' at line " +	cu.getLineNumber(node.getStartPosition()));
                }
                return true;
            }

        });
    }
//    public static void main(String[] args) {
//        String result;
//
//        String javaCode = "public class MyClass{ "
//                + "public static void main(String[] args) { "
//                + "System.out.println(\"Hello World\");"
//                + " }"
//                + " }";
//
//        Properties prefs = new Properties();
//        prefs.setProperty(JavaCore.COMPILER_SOURCE, CompilerOptions.VERSION_1_8);
//        prefs.setProperty(JavaCore.COMPILER_COMPLIANCE, CompilerOptions.VERSION_1_8);
//        prefs.setProperty(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, CompilerOptions.VERSION_1_8);
//
//        CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(prefs);
//        IDocument doc = new Document(javaCode);
//        try {
//            TextEdit edit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT | CodeFormatter.F_INCLUDE_COMMENTS,
//                    javaCode, 0, javaCode.length(), 0, null);
//            if (edit != null) {
//                edit.apply(doc);
//                result = doc.get();
//            }
//            else {
//                result = javaCode;
//            }
//        }
//        catch (BadLocationException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(result);
//    }
}