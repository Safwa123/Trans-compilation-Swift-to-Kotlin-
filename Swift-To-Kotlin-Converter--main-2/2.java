import generatedantlr.Swift3BaseVisitor;
import generatedantlr.Swift3Parser;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class swifttokotlinvisitor extends Swift3BaseVisitor<String> {

    public String swiftType;
    public String swift_identifier;
    public String Alert_message = "";
    public String Literal_expression;
    public HashMap<String, String> swiftTypeIDentifier = new HashMap<String, String>();
    public HashMap<String, String> swiftStrings = new HashMap<String, String>();
    public String array_type;
    public String for_iterator;
    public String ourclass;
    public String Java_import = "";
    public int for_flag = 0;
    public int class_flag = 0;
    public int print_counter = 0;
    public int Alert_counter = 0;
    public int TextEdit_counter = 0;
    public int TextField_counter = 0;
    public int Image_counter = 0;
    public boolean insert_flag = false;
    public boolean inherit_flag = false;
    public boolean text_flag = false;
    public boolean toastflag = false;
    public boolean exclamation_tag = false;
    public boolean Intentflag = false;
    public boolean extrabrace_flag = false;
    public boolean binary_flag = false;
    public boolean Old_URL_flag = false;
    public boolean Image_flag = false;
    public boolean Alert_flag = false;
    public boolean TextEdit_flag = false;
    public boolean TextField_flag = false;
    public String literal_annotation = "";
    public List<String> classlist = new ArrayList<String>();
    public String caller;
    public static boolean variable_declaration_flag = false;
    public static boolean print_statement_flag = false;
    /**
     * XML
     **/
    public static String XMLCode = " ";

    /**
     * Alert
     **/
    public static String XMLAlertIdentifier;
    public static String XMLAlertText;
    public static boolean XMLAlert_isReady;
    public static HashMap<String, String> AlertAttributes = new HashMap<>();

    /**
     * Image
     **/
    public static String XMLImageIdentifier;
    public static String XMLImageDescription;
    public static boolean XMLImage_isReady;

    /**
     * TextField
     **/
    public static String XMLTextFieldIdentifier;
    public static String XMLTextFieldText;
    public static boolean XMLTextField_isReady;

    /**
     * TextEditor
     **/
    public static String XMLTextEditorIdentifier;
    public static String XMLTextEditorText;
    public static boolean XMLTextEditor_isReady;

    /**** Button ****/
    /**
     * Java
     **/
    public static boolean Button_flag = false;
    public static int Button_counter = 0;
    public static String Button_Action = "";
    public static boolean Button_Action_Inprogress_wait_flag = false;
    public static String HardCodedLiteral_Expression;
    public static boolean Button_HCLE_flag = false;
    public static int Button_HCLE = 0;
    public static String ButtonText;
    /**
     * XML
     **/
    public static String XMLButtonIdentifier;
    public static String XMLButtonText;
    public static boolean XMLButton_isReady = false;

    /** Toggle **/
    /**
     * Java
     **/
    public static boolean Switch_flag = false;
    public static int Switch_counter = 0;
    public static String Switch_Action;
    public static boolean Switch_Action_Inprogress_flag = false;
    public static boolean Switch_HCLE_flag = false;
    public static int Switch_HCLE = 0;
    public static String SwitchText;
    /**
     * XML
     **/
    public static String XMLSwitchIdentifier;
    public static String XMLSwitchText;
    public static boolean XMLSwitch_isReady;

    /** URL **/
    /**
     * Java
     **/
    public static boolean URL_flag = false;
    public static int URL_counter = 0;
    public static String URL_link = "";
    public static boolean URL_Text_flag = false;
    public static boolean URL_Link_flag = false;
    public static boolean URL_Link_Inprogress_wait_flag = false;
    public static boolean URL_HCLE_flag = false;
    public static int URL_HCLE = 0;
    public static String URLText = "";
    /**
     * XML
     **/
    public static String XMLURLIdentifier;
    public static String XMLURLText;
    public static boolean XMLURL_irReady = false;

    /**** Button_URL ****/
    /**
     * Java
     **/
    public static int Button_URL_counter = 0;
    public static String Button_URL_Link = "";
    public static boolean Button_URL_HCLE_flag = false;
    public static int Button_URL_HCLE = 0;
    public static String Button_URLText;
    public static boolean Button_URL_flag = false;
    public static boolean Button_URL_isReady = false;
    /**
     * XML
     **/
    public static String XMLButton_URLIdentifier;
    public static String XMLButton_URLText;
    public static boolean XMLButton_URL_isReady = false;

    /**** ProgressBar ****/
    /**
     * Java
     **/
    public static boolean ProgressBar_flag = false;
    public static int ProgressBar_counter = 0;
    public static String ProgressBar_Action = "";
    public static boolean ProgressBar_Action_Inprogress_wait_flag = false;
    public static boolean ProgressBar_HCLE_flag = false;
    public static int ProgressBar_HCLE = 0;
    public static String ProgressBarText;
    public static String ProgressBar_Max = "";
    public static String ProgressBar_Progress = "";
    /**
     * XML
     **/
    public static String XMLProgressBarIdentifier;
    public static String XMLProgressBarMax;
    public static String XMLProgressBarProgress;
    public static String XMLPBTextViewIdentifier;
    public static String XMLPBTextViewText;
    public static boolean XMLProgressBar_isReady = false;

    /**** SecureField ****/
    /**
     * Java
     **/
    public static boolean SecureField_flag = false;
    public static int SecureField_counter = 0;
    /**
     * XML
     **/
    public static String XMLSecureFieldIdentifier;
    public static String XMLSecureFieldText;
    public static boolean XMLSecureField_isReady;

    /********* Stacks *********/
    /**** HStack ****/
    /**
     * Java
     **/
    public static boolean HStack_flag = false;
    public static boolean HStack_flag2 = false;
    public static int HStack_counter = 0;

    /**
     * XML
     **/
    public static String XMLHStack_Header = "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:paddingLeft=\"16dp\"\n" +
            "    android:paddingRight=\"16dp\"\n" +
            "    android:orientation=\"Horizontal\" >\n";
    public static String XMLHStack_Footer = "</LinearLayout>\n";
    /**** VStack ****/
    /**
     * Java
     **/
    public static boolean VStack_flag = false;
    public static boolean VStack_flag2 = false;
    public static int VStack_counter = 0;
    /**
     * XML
     **/
    public static String XMLVStack_Header = "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:paddingLeft=\"16dp\"\n" +
            "    android:paddingRight=\"16dp\"\n" +
            "    android:orientation=\"Vertical\" >\n";
    public static String XMLVStack_Footer = "</LinearLayout>\n";


    /*****************************/
    /**
     * Temporary Variables
     **/
    /*This hashmap is used to store the boolean expressions in the source code to match the boolean attribute in the switch(Toggle) component*/
    public static HashMap<String, String> BooleanHM = new HashMap<>();
    /**
     * Soliman
     **/
    /* This ArrayList contains the flags of all quoted statements that shouldn't be deleted, to consider them while converted the literal expressions*/
    public static ArrayList<Boolean> quoted_statements = new ArrayList<Boolean>();
    public static boolean FunctionCall_flag = false;
    public static boolean openURL_flag = false;


    public static String TextRegex = "[\"\'][_-a-zA-Z0-9]*[\"\']";

    public static int ComponentsCounter = 0;


    @Override
    public String visitTop_level(Swift3Parser.Top_levelContext ctx) {
        String kotlinCode = visitStatements(ctx.statements());
        return kotlinCode;
    }

    @Override
    public String visitStatements(Swift3Parser.StatementsContext ctx) {
        String kotlinStatements = "";
        kotlinStatements += visitStatements_impl(ctx.statements_impl());
        return kotlinStatements;
    }


    @Override
    public String visitStatements_impl(Swift3Parser.Statements_implContext ctx) {
        String kotlinStatementImplementation = "";
        kotlinStatementImplementation += visitStatement(ctx.statement());
        if(ctx.statements_impl()!=null){
            kotlinStatementImplementation+=visitStatements_impl(ctx.statements_impl());
        }
        return kotlinStatementImplementation;

    }

    @Override
    public String visitStatement(Swift3Parser.StatementContext ctx) {
        String kotlin_statment = "";
        try {
            if (ctx.branch_statement() != null) {
                kotlin_statment += visitBranch_statement(ctx.branch_statement());
            } else if (ctx.declaration() != null) {
                kotlin_statment += visitDeclaration(ctx.declaration());
            } else if (ctx.loop_statement() != null) {
                kotlin_statment += visitLoop_statement(ctx.loop_statement());
            } else if (ctx.expression() != null) {
                if (ctx.getText().contains("override")) {

                    kotlin_statment += "@Override";
                } else {
                    kotlin_statment += visitExpression(ctx.expression());

                }

            } else {
                return kotlin_statment;
            }


        } catch (Exception e) {
            return "Error in visit statments";
        }
        return kotlin_statment;
    }

    @Override
    public String visitControl_transfer_statement(Swift3Parser.Control_transfer_statementContext ctx) {
        return "";
    }

    @Override
    public String visitReturn_statement(Swift3Parser.Return_statementContext ctx) {
        return "";
    }

    @Override
    public String visitLoop_statement(Swift3Parser.Loop_statementContext ctx) {
        return "";
    }

    @Override
    public String visitFor_in_statement(Swift3Parser.For_in_statementContext ctx) {
        return "";
    }

//    public String V

    @Override
    public String visitRepeat_while_statement(Swift3Parser.Repeat_while_statementContext ctx) {
        return "";
    }

    @Override
    public String visitCode_block(Swift3Parser.Code_blockContext ctx) {
        String kotlin_block = "";
        try {
            if (ctx.statements() != null) {
                kotlin_block += visitStatements(ctx.statements());

            }
            return kotlin_block;
        } catch (Exception e) {
            kotlin_block += "Error in code block";
            kotlin_block += ctx.getText();

            return kotlin_block;
        }
    }

    @Override
    public String visitWhile_statement(Swift3Parser.While_statementContext ctx) {


        return "";
    }

    @Override
    public String visitProtocol_declaration(Swift3Parser.Protocol_declarationContext ctx) {
        String Protocoldeclaration = "";
        Protocoldeclaration += "interface ";
        Protocoldeclaration += ctx.protocol_name().getText() + " ";
        Protocoldeclaration += "{\n" + visitProtocol_body(ctx.protocol_body()) + "\n}";
        return Protocoldeclaration;
    }

    @Override
    public String visitProtocol_body(Swift3Parser.Protocol_bodyContext ctx) {
        String protocol_body = "";
        try {
            for (int i = 0; i < ctx.protocol_member().size(); i++) {
                //     protocol_body += visitDeclaration(ctx.protocol_member(i).protocol_member_declaration(i) + "\n");
            }
            return protocol_body;
        } catch (Exception e) {
            protocol_body += ctx.getText();
            return "ERROR in Class Body " + protocol_body;

        }

    }

    @Override
    public String visitImport_declaration(Swift3Parser.Import_declarationContext ctx) {
        String import_declration = "";
        import_declration += "import ";
        import_declration += visitImport_path(ctx.import_path());

        return import_declration;

    }
    @Override
    public String visitImport_path(Swift3Parser.Import_pathContext ctx) {
        String kotlin_path = "";
        if (ctx.getText().contains("SwiftUI")){

            kotlin_path+="android.os.Bundle\n";
            kotlin_path+="import androidx.activity.ComponentActivity\n";
            kotlin_path+="import androidx.activity.compose.setContent\n" +
                    "import androidx.compose.foundation.Image\n" +
                    "import androidx.compose.foundation.background\n" +
                    "import androidx.compose.foundation.layout.*\n" +
                    "import androidx.compose.foundation.lazy.LazyColumn\n" +
                    "import androidx.compose.foundation.lazy.items\n" +
                    "import androidx.compose.material3.*\n" +
                    "import androidx.compose.runtime.Composable\n" +
                    "import androidx.compose.ui.Alignment\n" +
                    "import androidx.compose.ui.Modifier\n" +
                    "import androidx.compose.ui.graphics.painter.Painter\n" +
                    "import androidx.compose.ui.layout.ContentScale\n" +
                    "import androidx.compose.ui.res.painterResource\n" +
                    "import androidx.compose.ui.text.style.TextAlign\n" +
                    "import androidx.compose.ui.tooling.preview.Preview\n" +
                    "import androidx.compose.ui.unit.dp\n";
        }

        return kotlin_path;
    }

    @Override
    public String visitDeclaration(Swift3Parser.DeclarationContext ctx) {

        try {

            String kotlin_declartion = "";

            if (ctx.import_declaration() != null) {
                kotlin_declartion += visitImport_declaration(ctx.import_declaration());
            }
            if (ctx.struct_declaration() != null) {
                kotlin_declartion += visitStruct_declaration(ctx.struct_declaration());
            }
            if (ctx.protocol_declaration() != null) {
                kotlin_declartion += visitProtocol_declaration(ctx.protocol_declaration());
            }
            if (ctx.class_declaration() != null) {

                kotlin_declartion += visitClass_declaration(ctx.class_declaration());
            }

            if (ctx.variable_declaration() != null) {
                kotlin_declartion += visitVariable_declaration(ctx.variable_declaration());

            } else if (ctx.function_declaration() != null) {

                kotlin_declartion += visitFunction_declaration(ctx.function_declaration());

            }
            return kotlin_declartion;


        } catch (Exception e) {

            return "Error in visitDeclartion";

        }

    }


    @Override
    public String visitStruct_declaration(Swift3Parser.Struct_declarationContext ctx) {
        String Struct_declration = "";
//        Struct_declration += "struct ";
        int index =ctx.getText().indexOf("ContentView");
        int index1=ctx.getText().indexOf("ContentView");
        if(index !=-1){
            Struct_declration+="Class ";
            Struct_declration += visitStruct_name(ctx.struct_name());
//            if(ctx.type_inheritance_clause() !=null){
//                Struct_declration+=visitType_inheritance_clause(ctx.type_inheritance_clause());
//            }
            Struct_declration += "{\n" + visitStruct_body(ctx.struct_body()) + "\n}";
        }
        else if(ctx.getText().contains(ctx.struct_name().getText()+":View")){
            Struct_declration+="fun ";

        }

//        Struct_declration += visitStruct_name(ctx.struct_name());
//        if(ctx.type_inheritance_clause() !=null){
//            Struct_declration+=visitType_inheritance_clause(ctx.type_inheritance_clause());
//        }
//        Struct_declration += "{\n" + visitStruct_body(ctx.struct_body()) + "\n}";
        return Struct_declration;
    }
    @Override
    public String visitStruct_name(Swift3Parser.Struct_nameContext ctx) {
        String kotlin_struct_name="";
        if (ctx.getText().contains("ContentView")){
            kotlin_struct_name+="MainActivity : ComponentActivity()";

        } else{
            kotlin_struct_name+=ctx.getText();
        }
        return kotlin_struct_name;
    }

//    @Override
//    public String visitType_inheritance_clause(Swift3Parser.Type_inheritance_clauseContext ctx) {
////        String type_inhertiance="";
////        type_inhertiance+=": ";
////        type_inhertiance+=visitType_inheritance_list(ctx.type_inheritance_list());
//        return type_inhertiance;
//    }
//    @Override
//    public String visitType_inheritance_list(Swift3Parser.Type_inheritance_listContext ctx) {
//        String Type_annotation ="";
//        System.out.println(ctx.getText());
//        if (ctx.getText().contains("View")) {
//            Type_annotation+="ComponentActivity()";
//        }
//        return Type_annotation;
//    }



    @Override
    public String visitStruct_body(Swift3Parser.Struct_bodyContext ctx) {
        String struct_body_declaration = "";
        try {
            for (int i = 0; i < ctx.struct_member().size(); i++) {
                struct_body_declaration += visitDeclaration(ctx.struct_member(i).declaration()) + "\n";
            }
            return struct_body_declaration;
        } catch (Exception e) {
            struct_body_declaration += ctx.getText();
            return "ERROR in Struct Body " + struct_body_declaration;
        }
    }

    @Override
    public String visitStruct_member(Swift3Parser.Struct_memberContext ctx) {
        return "";
    }

    @Override
    public String visitInitializer_declaration(Swift3Parser.Initializer_declarationContext ctx) {
        return "";
    }


    @Override
    public String visitParameter_list(Swift3Parser.Parameter_listContext ctx) {
        String Kotlin_parameter = "";

        try {
            for (int i = 0; i < ctx.parameter().size(); i++) {
                Kotlin_parameter += visitType_annotation(ctx.parameter(i).type_annotation()) + " ";
                Kotlin_parameter += ctx.parameter(i).local_parameter_name().getText();
                if (i != ctx.parameter().size() - 1)
                    Kotlin_parameter += ",";

            }
            return Kotlin_parameter;

        } catch (Exception e) {
            Kotlin_parameter += ctx.getText();
            return "TCIOSACERROR " + Kotlin_parameter;

        }
    }

    @Override
    /*siganture */ public String visitFunction_declaration(Swift3Parser.Function_declarationContext ctx) {
        try {
            String kotlin_function = "";
            kotlin_function += ctx.function_name().getText() + "(";
            kotlin_function += visitFunction_signature(ctx.function_signature()) + " ";
            kotlin_function += "\n{\n";
            kotlin_function += visitCode_block(ctx.function_body().code_block());
            kotlin_function += "\n}";
            return "fun " + kotlin_function;

        } catch (Exception e) {
            return "Error in func Declaration";
        }

    }

    @Override
    public String visitFunction_body(Swift3Parser.Function_bodyContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public String visitFunction_signature(Swift3Parser.Function_signatureContext ctx) {
        String kotlin_signature = "";
        try {
            if (ctx.parameter_clause().parameter_list() != null) {
                kotlin_signature += visitParameter_list(ctx.parameter_clause().parameter_list()) + ")";
            } else {
                kotlin_signature += ")";

            }
            return kotlin_signature;
        } catch (Exception e) {
            kotlin_signature += ctx.getText();
            return "ERROR in Func Siganture " + kotlin_signature;
        }
    }

    @Override
    public String visitConstant_declaration(Swift3Parser.Constant_declarationContext ctx) {
        return "";
    }

    @Override
    public String visitClass_declaration(Swift3Parser.Class_declarationContext ctx) {
        String kotlin_class = "";
        String kotlin_acesslevel = "";

        kotlin_class += " class ";
        kotlin_class += ctx.class_name().getText() + " ";
        kotlin_class += "{\n" + visitClass_body(ctx.class_body()) + "\n}";
        return kotlin_class;

    }

    @Override
    public String visitClass_body(Swift3Parser.Class_bodyContext ctx) {
        String kotlin_class_body = "";
        try {
            for (int i = 0; i < ctx.class_member().size(); i++) {
                kotlin_class_body += visitDeclaration(ctx.class_member(i).declaration()) + "\n";
            }
            return kotlin_class_body;
        } catch (Exception e) {
            kotlin_class_body += ctx.getText();
            return "ERROR in Class Body " + kotlin_class_body;
        }
    }

    @Override
    public String visitBranch_statement(Swift3Parser.Branch_statementContext ctx) {

        return "";
    }

    @Override
    public String visitGuard_statement(Swift3Parser.Guard_statementContext ctx) {
        return "";
    }

    @Override
    public String visitIf_statement(Swift3Parser.If_statementContext ctx) {
        return "";
    }

    @Override
    public String visitCondition_list(Swift3Parser.Condition_listContext ctx) {
        return "";
    }


    @Override
    public String visitCondition(Swift3Parser.ConditionContext ctx) {
        return "";
    }

    @Override
    public String visitElse_clause(Swift3Parser.Else_clauseContext ctx) {
        return "";
    }

    @Override
    public String visitSwitch_statement(Swift3Parser.Switch_statementContext ctx) {
        return "";
    }

    @Override
    public String visitSwitch_cases(Swift3Parser.Switch_casesContext ctx) {
        return "";
    }

    @Override
    public String visitSwitch_case(Swift3Parser.Switch_caseContext ctx) {
        return "";
    }

    @Override
    public String visitVariable_declaration(Swift3Parser.Variable_declarationContext ctx) {
        String kotlinVariableDeclaration = "";
        if(ctx.getText().indexOf("") !=-1){

        }
        kotlinVariableDeclaration += "var ";
        kotlinVariableDeclaration += visitPattern_initializer_list(ctx.pattern_initializer_list());
//        System.out.println(kotlinVariableDeclaration);
        return kotlinVariableDeclaration;
    }

    @Override
    public String visitPattern_initializer_list(Swift3Parser.Pattern_initializer_listContext ctx) {
        String kotlinVariableInitializerList = "";
        for (int i = 0; i < ctx.pattern_initializer().size(); i++) {
            kotlinVariableInitializerList += visitPattern_initializer(ctx.pattern_initializer(i));
        }
        return kotlinVariableInitializerList;
    }

    @Override
    public String visitPattern_initializer(Swift3Parser.Pattern_initializerContext ctx) {
        String kotlinPatternInitializer = "";
        kotlinPatternInitializer += visitPattern(ctx.pattern());
        if (ctx.initializer() == null)
            return kotlinPatternInitializer;

        return kotlinPatternInitializer + visitInitializer(ctx.initializer());
    }

    @Override
    public String visitPattern(Swift3Parser.PatternContext ctx) {
        String kotlinPattern = "";
        kotlinPattern += visitIdentifier_pattern(ctx.identifier_pattern());
        // Added in 19/6/2023
        kotlinPattern+=ctx.type_annotation().getText();
        return kotlinPattern;
    }


    @Override
    public String visitExpression_pattern(Swift3Parser.Expression_patternContext ctx) {
        return "";
    }

    @Override
    public String visitType_annotation(Swift3Parser.Type_annotationContext ctx) {
        return "";
    }

    @Override
    public String visitIdentifier_pattern(Swift3Parser.Identifier_patternContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitInitializer(Swift3Parser.InitializerContext ctx) {
        String java_initializer = " ";

        try {
            java_initializer += ctx.assignment_operator().getText();
            String array_expression = ctx.expression().getText();

            if (array_expression.startsWith("[") == true) {
                java_initializer += "{";
                array_expression = array_expression.substring(1, array_expression.length() - 1) + "}";
                java_initializer += array_expression;
                return java_initializer;
            } else {
                java_initializer += " ";
//            System.out.println("889"+ java_initializer);
                java_initializer += visitExpression(ctx.expression());
//            System.out.println("891"+ java_initializer);
            }
            return java_initializer + array_expression;
        } catch (Exception e) {
            return "TCIOSACERROR " + java_initializer;
        }


//        String kotlinInitializer = " ";
//        System.out.println("before =10");
//
//        if (ctx.expression() != null){
//
//            kotlinInitializer = visitExpression(ctx.expression());
//
//        }
//        System.out.println(kotlinInitializer);
//        //return " = " + kotlinInitializer ;
//        return ctx.getText();
    }

    @Override
    public String visitExpression(Swift3Parser.ExpressionContext ctx) {
        String kotlinPrefixExpression = visitPrefix_expression(ctx.prefix_expression());

        return kotlinPrefixExpression;
    }

    @Override
    public String visitBinary_expressions(Swift3Parser.Binary_expressionsContext ctx) {
        return "";
    }

    @Override
    public String visitBinary_expression(Swift3Parser.Binary_expressionContext ctx) {
        return "";
    }

    @Override
    public  String visitPostfix_expression(Swift3Parser.Postfix_expressionContext ctx){
      return "dsdsa";
    }
    @Override
    public String visitPrefix_expression(Swift3Parser.Prefix_expressionContext ctx) {
        String Java_prefix = "";
        try {

            try {

                    if (ctx.prefix_operator() != null) {
                        Java_prefix += ctx.prefix_operator().getText();
                    }

                    //This is writing if we like to visit Primary directly
                    else if (Swift3Parser.PrimaryContext.class.isInstance(ctx.postfix_expression())) {
                        Swift3Parser.PrimaryContext pctx = (Swift3Parser.PrimaryContext) ctx.postfix_expression();
//                    System.out.println("958"+ pctx.getText());
                        Java_prefix += visitPrimary(pctx);
                    }
//                    else if (Swift3Parser.Function_call_expression_with_closureContext.class.isInstance(ctx.postfix_expression())) {
//
//                        Java_prefix+=visitPostfix_expression(ctx.postfix_expression());
//                    }

                    else if (Swift3Parser.Function_call_expression_with_closureContext.class.isInstance(ctx.postfix_expression())) {
                        /** SOLIMAN (Sun 25 Jun) **/
                        /*
                        if we increment the returned converted statements on "Java_prefix" in here we
                        will have to re-write the conversion code for (function_call_argument_clause) and (trailing clause).

                        the best choice is to pass the ctx.function_call_expression_with_closure() to its visiting function
                        and we can start converting and incrementing on the function_call_expression_with_closure visiting function.
                        * */

                        if(ctx.getText().contains("VStack")||ctx.getText().contains("HStack") ||ctx.getText().contains("ZStack")||ctx.getText().contains("NavigationView")||ctx.getText().contains("ScrollView")||ctx.getText().contains("Foreach")){
                            Java_prefix+=visitFunction_call_expression_with_closure((Swift3Parser.Function_call_expression_with_closureContext) ctx.postfix_expression());

                        }

//                        if(ctx.postfix_expression().getText().contains("VStack")){
//                            Java_prefix+="Column";
//                        }
//                        if(ctx.postfix_expression().getText().contains("HStack")){
//                            Java_prefix+="Row";
//                        }
//                        if(ctx.postfix_expression().getText().contains("LazyVStack" )|| (ctx.postfix_expression().getText().contains("ScrollView"))){
//                            Java_prefix+="LazyColumn";
//                        }
//                        if(ctx.postfix_expression().getText().contains("LazyHStack")){
//                            Java_prefix+="LazyRow";
//                        }

//                        Swift3Parser.Function_call_expression_with_closureContext fcctx = (Swift3Parser.Function_call_expression_with_closureContext) ctx.postfix_expression();
//                        Java_prefix += visitClosure_expression(fcctx.trailing_closure().closure_expression());

                    }


                    else if (Swift3Parser.Function_call_expressionContext.class.isInstance(ctx.postfix_expression())) {
                        Swift3Parser.Function_call_expressionContext fnctx = (Swift3Parser.Function_call_expressionContext) ctx.postfix_expression();
                        if (fnctx.function_call_argument_clause().function_call_argument_list() != null) {

                            if (fnctx.function_call_argument_clause().function_call_argument_list().function_call_argument(0).expression().binary_expressions() != null) {
                                binary_flag = true;
                            }
                        }

                        if (Swift3Parser.PrimaryContext.class.isInstance(fnctx.postfix_expression())) {
                            Swift3Parser.PrimaryContext pctx = (Swift3Parser.PrimaryContext) fnctx.postfix_expression();
                            Java_prefix += visitPrimary(pctx);

                        }

                        if (Java_prefix.contains("Toast")) {
                            toastflag = true;
                            Java_prefix += visitFunction_call_argument_clause(fnctx.function_call_argument_clause()) + ").show()";
                            return Java_prefix;
                        } else if (Java_prefix.contains(("super.onCreate"))) {
                            Java_prefix += "savedInstanceState); \n setContentView(R.layout.activity_main)";
                            return Java_prefix;
                        }
                        //double bracket
                        //else if (fnctx.function_call_argument_clause().getText().contains("()"))

                        if (Old_URL_flag) {
                            Java_prefix += visitFunction_call_argument_clause(fnctx.function_call_argument_clause());
                            // Java_prefix += " = new URL(";
                        } else if (Image_flag) {
                            Java_prefix += visitFunction_call_argument_clause(fnctx.function_call_argument_clause()) + Image_counter;
                            Java_prefix += "=(ImageView)findViewById(R.id." + Literal_expression + Image_counter + ")";
                            XMLImageIdentifier = Literal_expression + Image_counter;
                            XMLImageDescription = Literal_expression;
                            Image_flag = false;
                            Image_counter++;
                            XMLImage_isReady = true;
                        } else if (TextField_flag) {
                            Java_prefix += " simpleEditText" + TextField_counter + " = (EditText) findViewById(R.id.simpleEditText" + TextField_counter + ");\n";
                            String tmp = visitFunction_call_argument_clause(fnctx.function_call_argument_clause());
                            Java_prefix += "simpleEditText" + TextField_counter + ".setText(\"" + Literal_expression + "\")";
                            XMLTextFieldIdentifier = "simpleEditText" + TextField_counter;
                            XMLTextFieldText = Literal_expression;
                            TextField_flag = false;
                            XMLTextField_isReady = true;
                        }

                        /** Soliman **/
                        /* This flag is explained at the end of the block and the ReadMe.txt file */
                        else if (Button_flag && !Button_Action_Inprogress_wait_flag) {
                            Java_prefix += " button" + Button_counter + " = (Button) findViewById(R.id.button" + Button_counter + ");\n";
                            visitFunction_call_argument_clause(fnctx.function_call_argument_clause());//Calling it to initiate the Button action conversion process in (visitFunction_argument_list())

                            if (Button_HCLE_flag) {//This condition is meant to check whether the HardcodedLiteral_Expression or the Literal_expression is going to be assigned to the SwitchText
                                ButtonText = HardCodedLiteral_Expression;
                                Button_HCLE_flag = false;
                            } else {
                                ButtonText = Literal_expression;
                            }
                            if (!ButtonText.contains("\"") && !ButtonText.contains("\'")) {//Checking if the text contains quotes.
                                ButtonText = "\"" + ButtonText + "\"";
                            }

                            Java_prefix += "button" + Button_counter + ".setText(" + ButtonText + ");\n";
                            Java_prefix += "button" + Button_counter + ".setOnClickListener(new View.OnClickListener(){\n";
                            Java_prefix += "\tpublic void onClick(View view){\n";
                            Java_prefix += "\t\t" + Button_Action + "\n";
                            Java_prefix += "\t}\n";
                            Java_prefix += "})";

                            Button_flag = false;//Indicating that the Button conversion process is terminated.
                            XMLButtonIdentifier = "button" + Button_counter;//Fetching Button identifier for XML conversion.
                            XMLButtonText = ButtonText;//Fetching Button text for XML conversion.
                            XMLButton_isReady = true;//Indicates that the Java conversion process is done and all the need attributes or parameters are collected, and initiate the XML conversion process.


                        } /** soliman**/
                        else if (Switch_flag) {//Checking whether a switch component has been detected or not.
                            Java_prefix += " switch" + Switch_counter + " = (Switch) findViewById(R.id.Switch" + Switch_counter + ");\n";
                            visitFunction_call_argument_clause(fnctx.function_call_argument_clause());//Calling it to initiate the Switch action conversion process in (visitFunction_argument_list())

                            if (Switch_HCLE_flag) {//This condition is meant to check whether the HardcodedLiteral_Expression or the Literal_expression is going to be assigned to the SwitchText
                                SwitchText = HardCodedLiteral_Expression;
                                Switch_HCLE_flag = false;
                            } else {
                                SwitchText = Literal_expression;
                            }
                            if (!SwitchText.contains("\"") && !SwitchText.contains("\'")) {//Checking if the text contains quotes.
                                SwitchText = "\"" + SwitchText + "\"";
                            }

                            Java_prefix += "switch" + Switch_counter + ".setText(" + SwitchText + ");\n";
                            Java_prefix += "switch" + Switch_counter + ".setOnClickListener(new View.OnClickListener(){\n";
                            Java_prefix += "\tpublic void onClick(View view){\n";
                            Java_prefix += "\t\t" + Switch_Action + "\n";
                            Java_prefix += "\t}\n";
                            Java_prefix += "})";

                            Switch_flag = false;//Indicating that the Switch conversion process is terminated.
                            XMLSwitchIdentifier = "switch" + Switch_counter;//Fetching Switch identifier for XML conversion.
                            XMLSwitchText = SwitchText;//Fetching Switch text for XML conversion.
                            XMLSwitch_isReady = true;//Indicates that the Java conversion process is done and all the need attributes or parameters are collected, and initiate the XML conversion process.
                        } else if (URL_flag) {

                            Java_prefix += "Button urlButton" + URL_counter + " = (Button) findViewById(R.id.urlButton" + URL_counter + ");\n";

                            visitFunction_call_argument_clause(fnctx.function_call_argument_clause());

                            if (URL_HCLE_flag) {//This condition is meant to check whether the HardcodedLiteral_Expression or the Literal_expression is going to be assigned to the SwitchText
                                URLText = HardCodedLiteral_Expression;
                                URL_HCLE_flag = false;
                            } else {
                                URLText = Literal_expression;
                            }
                            if (!URLText.contains("\"") && !URLText.contains("\'")) {//Checking if the text contains quotes.
                                URLText = "\"" + URLText + "\"";
                            }

                            Java_prefix += "urlButton" + URL_counter + ".setText(" + URLText + ");\n";
                            Java_prefix += "urlButton" + URL_counter + ".setOnClickListener(new onClickListener() {\n";
                            Java_prefix += "\t@Override\n";
                            Java_prefix += "\tpublic void onClick(View view) {\n";
                            Java_prefix += "\t\tString url = " + URL_link + ";\n";
                            Java_prefix += "\t\tIntent i = new Intent(Intent.ACTION_VIEW);\n";
                            Java_prefix += "\t\ti.setData(Uri.parse(url));\n";
                            Java_prefix += "\tstartActivity(i);\n";
                            Java_prefix += "}\n";
                            Java_prefix += "})";

                            URL_flag = false;
                            XMLURLIdentifier = "urlButton" + URL_counter;
                            XMLURLText = URLText;

                        } else if (fnctx.function_call_argument_clause() != null) {

                                /** Soliman **/
                                /* I commenteed the line below Because it was adding an extra left parenthesis to my action in the Button action attribute */
//                            Swift3Parser.PrimaryContext pctx = (Swift3Parser.PrimaryContext) ctx.postfix_expression();
////                    System.out.println("958"+ pctx.getText());
//                            Java_prefix += visitPrimary(pctx);
                                Java_prefix += visitFunction_call_argument_clause(fnctx.function_call_argument_clause()) ;


                        }

                        /** Soliman **/
                        /* Button_YRL conversion function */
                        if (Button_URL_isReady) {

                            Java_prefix = Java_prefix.substring(0, Java_prefix.length() - 1);//This is used to remove an extra ")" before the button declaration.
                            Java_prefix += "Button ButtonURL" + Button_URL_counter + " = (Button) findViewById(R.id.ButtonURL" + Button_URL_counter + ");\n";

                            if (!Button_URLText.contains("\"") && !Button_URLText.contains("\'")) {//Checking if the text contains quotes.
                                URLText = "\"" + Button_URLText + "\"";
                            }
                            if (!Button_URL_Link.contains("\"") && !Button_URL_Link.contains("\'")) {//Checking if the text contains quotes.
                                URLText = "\"" + Button_URL_Link + "\"";
                            }

                            Java_prefix += "ButtonURL" + Button_URL_counter + ".setText(" + Button_URLText + ");\n";
                            Java_prefix += "ButtonURL" + Button_URL_counter + ".setOnClickListener(new onClickListener() {\n";
                            Java_prefix += "\t@Override\n";
                            Java_prefix += "\tpublic void onClick(View view) {\n";
                            Java_prefix += "\t\tString url = " + Button_URL_Link + ";\n";
                            Java_prefix += "\t\tIntent i = new Intent(Intent.ACTION_VIEW);\n";
                            Java_prefix += "\t\ti.setData(Uri.parse(url));\n";
                            Java_prefix += "\tstartActivity(i);\n";
                            Java_prefix += "}\n";
                            Java_prefix += "})";

                            Button_URL_isReady = false;
                            Button_URL_flag = false;
                        }
                        if (Intentflag) {
                            Intentflag = false;
                            Java_prefix += ";\n" + " startActivity(intent)";
                        }

                    }


                    else if (Swift3Parser.Subscript_expressionContext.class.isInstance(ctx.postfix_expression())) {
                        Swift3Parser.Subscript_expressionContext subctx = (Swift3Parser.Subscript_expressionContext) ctx.postfix_expression();
                        Java_prefix += subctx.postfix_expression().getText();
                        Java_prefix += ".get(";
                        Java_prefix += subctx.expression_list().getText() + ")";
                    } else if (Swift3Parser.Explicit_member_expression2Context.class.isInstance(ctx.postfix_expression())) {
                        Swift3Parser.Explicit_member_expression2Context exctx = (Swift3Parser.Explicit_member_expression2Context) ctx.postfix_expression();
                        if (ctx.postfix_expression().getText().contains("text!"))
                            exclamation_tag = true;
                        Java_prefix += visitExplicit_member_expression2(exctx);
                        if (text_flag == true) {
                            return Java_prefix;
                        }
                        Java_prefix += ")";
                    } else if (ctx.getText().contains("text!")) {
                        exclamation_tag = true;
                        Swift3Parser.Postfix_operationContext pctx = (Swift3Parser.Postfix_operationContext) ctx.postfix_expression();
                        if (Swift3Parser.Explicit_member_expression2Context.class.isInstance(pctx.postfix_expression())) {
                            Swift3Parser.Explicit_member_expression2Context ectx = (Swift3Parser.Explicit_member_expression2Context) pctx.postfix_expression();
                            Java_prefix += visitExplicit_member_expression2(ectx);
                        }
                        return Java_prefix + ")";

                    } else {
                        Java_prefix += ctx.getText();
                    }
                    return Java_prefix;
                }catch(Exception e){
                    return "TCIOSACERROR  1 " + ctx.getText();
                }
            } catch (Exception e) {
                return "TCIOSACERROR Statements " + ctx.getText();
            }

        }




    @Override
    public String visitExplicit_member_expression2(Swift3Parser.Explicit_member_expression2Context ctx) {
        return "";
    }

    @Override
    public String visitPostfix_operation(Swift3Parser.Postfix_operationContext ctx) {
//        System.out.println(ctx.getChild(0) + " "+ ctx.getChild(1));
        return ctx.getChild(0) + " "+ ctx.getChild(1);
    }

    @Override
    public String visitPrimary(Swift3Parser.PrimaryContext ctx) {
        String kotlinPrimary="";
        String Java_primary="";



        Java_primary+=visitPrimary_expression(ctx.primary_expression());

            return Java_primary;


    }

    @Override
    public String visitPrimary_expression(Swift3Parser.Primary_expressionContext ctx) {
        try {
            String kotlin_primary_exp = "";
            if(ctx.closure_expression()!=null){
                kotlin_primary_exp+=visitClosure_expression(ctx.closure_expression());
            }

            else if(ctx.literal_expression() !=null){
                kotlin_primary_exp+=visitLiteral_expression(ctx.literal_expression());
            }
            else {
                String kotlin_type = ctx.getText();
                kotlin_primary_exp += visitDeclaration_identifier(ctx.declaration_identifier());
            }
            return kotlin_primary_exp;
        } catch (Exception e){
            return "Erro in primary expression";
        }



    }
    @Override public String visitDeclaration_identifier(Swift3Parser.Declaration_identifierContext ctx)
    {
        String kotlin_delcaration="";

        if(ctx.getText().contains("List")){
            kotlin_delcaration+="LazyColumn";
        }
        else if(ctx.getText().contains("HStack")) {
//            kotlin_delcaration= kotlin_delcaration.replace("()","{}");
            kotlin_delcaration+="Row";

//            kotlin_delcaration+=;

    }
        else if(ctx.getText().contains("VStack")) {
            kotlin_delcaration+="Column";
        }  else if(ctx.getText().contains("ZStack")) {
            kotlin_delcaration+="Box";
        }
        else if(ctx.getText().contains("Image")){
            kotlin_delcaration+="Image";
        }
        else {

//            kotlin_delcaration+='"';
            kotlin_delcaration+=ctx.getText();

        }
        return kotlin_delcaration;
    }

    @Override
    public String visitTrailing_closure(Swift3Parser.Trailing_closureContext ctx)
    {
        String traling_closure ="";
        traling_closure+=visitClosure_expression(ctx.closure_expression());
//        return visitChildren(ctx);
        return traling_closure;
    }


    @Override
    public String visitClosure_expression(Swift3Parser.Closure_expressionContext ctx) {
        String Java_closure = "";

        Java_closure+="{\n";
        if(ctx.closure_signature()!=null){
            Java_closure+=visitClosure_signature(ctx.closure_signature());
        }
        Java_closure+=visitStatements(ctx.statements());
        Java_closure+="\n}";

        return Java_closure;
    }
    @Override public String visitClosure_signature(Swift3Parser.Closure_signatureContext ctx) {
        String closure="";
        closure+=ctx.getText()+" "+"in\n";
        return closure;
    }

    @Override
    public String visitLiteral_expression(Swift3Parser.Literal_expressionContext ctx) {
        return ctx.literal().getText();

    }
    @Override
    public String visitParenthesized_expression(Swift3Parser.Parenthesized_expressionContext ctx) {
        return "";
    }

    @Override
    public String visitPostfix_operator(Swift3Parser.Postfix_operatorContext ctx) {
        return "";
    }

    @Override
    public String visitFunction_call_argument_clause(Swift3Parser.Function_call_argument_clauseContext ctx) {
        String Java_clause = "";
        try {
            /** Soliman **/
            /* Checking if a Button with URL is detected and converting it */

            if (ctx.function_call_argument_list() != null) {
                Java_clause += "(";
                Java_clause += visitFunction_call_argument_list(ctx.function_call_argument_list());
                Java_clause += ")";

            }
            else{
                Java_clause+="()";
            }
//            Java_clause+=visitfuc

            /** Soliman **/
            /* The line below was deleted because it used to return the URL before the button declaration while converting the Button_URL.
             * Might be deleted if it causes an error with other components */
            //Java_clause+=visitFunction_call_argument_list(ctx.function_call_argument_list());
            return Java_clause;
        } catch (Exception e) {
            return "TCAIOSCERROR" + ctx.getText();
        }
    }


    @Override
    public String visitFunction_call_argument_list(Swift3Parser.Function_call_argument_listContext ctx) {
        String kotlin_function_list="";
        for (int j = 0; j < ctx.function_call_argument().size(); j++) {
            kotlin_function_list += visitFunction_call_argument(ctx.function_call_argument(j));
            if (j != ctx.function_call_argument().size() - 1)
                kotlin_function_list += ",";
        }



//        kotlin_function_list+=ctx.getText();

        return kotlin_function_list;
    }

    @Override
    public String visitFunction_call_argument(Swift3Parser.Function_call_argumentContext ctx) {
        String kotlin_function_call_argument="";
        try {
            if (ctx.label_identifier() !=null) {
                kotlin_function_call_argument += visitLabel_identifier(ctx.label_identifier());
//                kotlin_function_call_argument += ":";
            }
            kotlin_function_call_argument += visitExpression(ctx.expression());
        } catch (Exception e){
            return "Error in Line 1110";
        }
        return kotlin_function_call_argument;
    }
    @Override
    public String visitLabel_identifier(Swift3Parser.Label_identifierContext ctx) {

        String label_identifer ="";
        try {
            if(ctx.getText().contains("action")){

                label_identifer+="onclick =";

            }
            else{
                label_identifer +=ctx.getText();
            }
            return label_identifer;

        }catch (Exception e){
            return "E in line 1171";
        }


    }


    @Override
    public String visitFunction_call_expression_with_closure(Swift3Parser.Function_call_expression_with_closureContext ctx){
        String Kotlin_output ="";
        if(ctx.postfix_expression().getChild(0).getText().contains("NavigationView")){
            Kotlin_output+="Navigation";
        }
        if(ctx.postfix_expression().getChild(0).getText().contains("ScrollView")){
            Kotlin_output+="Modifier.scrollable";
        }
        if(ctx.postfix_expression().getChild(0).getText().contains("Foreach")){
            Kotlin_output+="LazyColumn";
        }
        if(ctx.postfix_expression().getChild(0).getText().contains("VStack")){
            Kotlin_output+="Column";
        }else if(ctx.postfix_expression().getChild(0).getText().contains("HStack")){
            Kotlin_output+="Row";
        }else if(ctx.postfix_expression().getChild(0).getText().contains("ZStack")){
            Kotlin_output+="Box";
        }


        if(ctx.getChild(0).getChild(1)!=null){
            Kotlin_output+=visitFunction_call_argument_clause((Swift3Parser.Function_call_argument_clauseContext)ctx.getChild(0).getChild(1));
        }
        if(ctx.trailing_closure()!=null){
            Kotlin_output+=visitTrailing_closure(ctx.trailing_closure());
        }

//        System.out.println(ctx.getChild(0).getChild(1).getText());
//        System.out.println(ctx.getChild(0).getChild(1).getChild(1).getText());
//        Kotlin_output+=visitFunction_call_argument_clause((Swift3Parser.Function_call_argument_clauseContext) ctx.postfix_expression().getChild(1));
//        Kotlin_output+=visitTrailing_closure(ctx.trailing_closure());
        return Kotlin_output;
    }
}
