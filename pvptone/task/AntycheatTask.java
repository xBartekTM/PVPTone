package pvptone.task;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class AntycheatTask extends Object<AntycheatTask>
{
    public String[] Field_2951;
    public int[] Field_2952;
    
    public void Method_13395() {
        (AntycheatTask.Field_2952 = new int[13])[0] = ((142 + 153 - 258 + 215 ^ 68 + 116 - 106 + 108) & (40 + 168 - 93 + 105 ^ 122 + 8 - 21 + 45 ^ -" ".length()));
        AntycheatTask.Field_2952[1] = " ".length();
        AntycheatTask.Field_2952[2] = "  ".length();
        AntycheatTask.Field_2952[3] = "   ".length();
        AntycheatTask.Field_2952[4] = (12 + 91 - 7 + 40 ^ 74 + 51 - 120 + 135);
        AntycheatTask.Field_2952[5] = (0x81 ^ 0x84);
        AntycheatTask.Field_2952[6] = (0x0 ^ 0x6);
        AntycheatTask.Field_2952[7] = ("  ".length() ^ (0x30 ^ 0x35));
        AntycheatTask.Field_2952[8] = (0xB6 ^ 0xBE);
        AntycheatTask.Field_2952[9] = (96 + 35 + 70 + 3 ^ 56 + 5 + 131 + 5);
        AntycheatTask.Field_2952[10] = (13 + 83 + 29 + 81 ^ 167 + 43 - 166 + 152);
        AntycheatTask.Field_2952[11] = (0x21 ^ 0x3B ^ (0x2C ^ 0x3D));
        AntycheatTask.Field_2952[12] = (0xF7 ^ 0x90 ^ (0x2E ^ 0x45));
    }
    
    public String Method_13396(final String Variable_139607, String Variable_139605) {
        try {
            Variable_139605 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_139607.getBytes(StandardCharsets.UTF_8)), AntycheatTask.Field_2952[8]), "DES");
            final Cipher Variable_139608 = Cipher.getInstance("DES");
            Variable_139608.init(AntycheatTask.Field_2952[2], Variable_139605);
            return new String(Variable_139608.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_139609) {
            Variable_139609.printStackTrace();
            return null;
        }
    }
    
    public void Method_13397() {
        (AntycheatTask.Field_2951 = new String[AntycheatTask.Field_2952[12]])[AntycheatTask.Field_2952[0]] = Method_13400("Mk5SpWjhKndNIBVtkowOoQ==", "sZfui");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[1]] = Method_13396("bvwGP3QJ2Ls=", "ZJLUs");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[2]] = Method_13403("ChwVLR4MGhclBAw=", "itpLj");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[3]] = Method_13396("Emcwe5I/mx3HWuS1WS6Www==", "aUUTO");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[4]] = Method_13396("Eix9DhXxPPI=", "ySOzQ");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[5]] = Method_13403("Hhc/JCF9", "VxLPR");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[6]] = Method_13400("OwAvkhFp8rE=", "cVcQs");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[7]] = Method_13403("HBYbPAgBFwM=", "uxqYk");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[8]] = Method_13400("IqVZHUzW/yzHaV0+zfdnHA==", "ixTtF");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[9]] = Method_13400("GhlguoVLgr8=", "ndiTw");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[10]] = Method_13403("OhUXJCcBBgtzJQcKDycpGA==", "oonSF");
        AntycheatTask.Field_2951[AntycheatTask.Field_2952[11]] = Method_13396("t4mGmS2X+n4=", "IseYK");
    }
    
    static {
        Method_13395();
        Method_13397();
    }
    
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //     6: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //     9: iconst_0       
        //    10: iaload         
        //    11: aaload         
        //    12: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //    15: astore_2        /* Variable_139620 */
        //    16: new             Ljava/io/BufferedReader;
        //    19: dup            
        //    20: new             Ljava/io/InputStreamReader;
        //    23: dup            
        //    24: aload_2         /* Variable_139620 */
        //    25: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //    28: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    31: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    34: astore_3        /* Variable_139616 */
        //    35: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //    38: iconst_0       
        //    39: iaload         
        //    40: istore          Variable_139619
        //    42: ldc             ""
        //    44: invokevirtual   java/lang/String.length:()I
        //    47: pop            
        //    48: sipush          212
        //    51: sipush          187
        //    54: ixor           
        //    55: bipush          9
        //    57: bipush          99
        //    59: ixor           
        //    60: ixor           
        //    61: ifne            255
        //    64: return         
        //    65: aload_1         /* Variable_139611 */
        //    66: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //    69: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //    72: iconst_1       
        //    73: iaload         
        //    74: aaload         
        //    75: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    78: invokestatic    pvptone/task/AntycheatTask.Method_13399:(I)Z
        //    81: ifeq            200
        //    84: aload_1         /* Variable_139611 */
        //    85: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //    88: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //    91: iconst_2       
        //    92: iaload         
        //    93: aaload         
        //    94: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    97: invokestatic    pvptone/task/AntycheatTask.Method_13399:(I)Z
        //   100: ifeq            200
        //   103: aload_1         /* Variable_139611 */
        //   104: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   107: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   110: iconst_3       
        //   111: iaload         
        //   112: aaload         
        //   113: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   116: invokestatic    pvptone/task/AntycheatTask.Method_13399:(I)Z
        //   119: ifeq            200
        //   122: aload_1         /* Variable_139611 */
        //   123: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   126: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   129: iconst_4       
        //   130: iaload         
        //   131: aaload         
        //   132: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   135: invokestatic    pvptone/task/AntycheatTask.Method_13399:(I)Z
        //   138: ifeq            200
        //   141: aload_1         /* Variable_139611 */
        //   142: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   145: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   148: iconst_5       
        //   149: iaload         
        //   150: aaload         
        //   151: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   154: invokestatic    pvptone/task/AntycheatTask.Method_13399:(I)Z
        //   157: ifeq            200
        //   160: aload_1         /* Variable_139611 */
        //   161: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   164: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   167: bipush          6
        //   169: iaload         
        //   170: aaload         
        //   171: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   174: invokestatic    pvptone/task/AntycheatTask.Method_13399:(I)Z
        //   177: ifeq            200
        //   180: aload_1         /* Variable_139611 */
        //   181: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   184: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   187: bipush          7
        //   189: iaload         
        //   190: aaload         
        //   191: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   194: invokestatic    pvptone/task/AntycheatTask.Method_13401:(I)Z
        //   197: ifeq            255
        //   200: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //   203: invokevirtual   net/minecraft/client/Minecraft.getSession:()Lnet/minecraft/util/Session;
        //   206: invokevirtual   net/minecraft/util/Session.getUsername:()Ljava/lang/String;
        //   209: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   212: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   215: bipush          8
        //   217: iaload         
        //   218: aaload         
        //   219: invokestatic    java/lang/System.getenv:(Ljava/lang/String;)Ljava/lang/String;
        //   222: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   225: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   228: bipush          9
        //   230: iaload         
        //   231: aaload         
        //   232: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   235: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   238: bipush          10
        //   240: iaload         
        //   241: aaload         
        //   242: getstatic       pvptone/task/AntycheatTask.Field_2951:[Ljava/lang/String;
        //   245: getstatic       pvptone/task/AntycheatTask.Field_2952:[I
        //   248: bipush          11
        //   250: iaload         
        //   251: aaload         
        //   252: invokestatic    pvptone/loaders/BlacklistLoader.addBlacklist:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   255: aload_3         /* Variable_139616 */
        //   256: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   259: dup            
        //   260: astore_1        /* Variable_139621 */
        //   261: invokestatic    pvptone/task/AntycheatTask.Method_13398:(Ljava/lang/Object;)Z
        //   264: ifeq            65
        //   267: ldc             ""
        //   269: invokevirtual   java/lang/String.length:()I
        //   272: pop            
        //   273: ldc             "   "
        //   275: invokevirtual   java/lang/String.length:()I
        //   278: bipush          119
        //   280: bipush          112
        //   282: ixor           
        //   283: ixor           
        //   284: ineg           
        //   285: ifle            294
        //   288: return         
        //   289: astore_1        /* Variable_139621 */
        //   290: aload_1         /* Variable_139615 */
        //   291: invokevirtual   java/io/IOException.printStackTrace:()V
        //   294: return         
        //    StackMapTable: 00 05 FF 00 41 00 05 07 00 02 07 00 11 07 00 C1 07 00 BD 01 00 00 FB 00 86 FF 00 36 00 05 07 00 02 00 07 00 C1 07 00 BD 01 00 00 FF 00 21 00 01 07 00 02 00 01 07 00 B1 FC 00 04 07 00 FE
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      267    289    294    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:192)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:45)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean Method_13398(final Object o) {
        return this == null;
    }
    
    public boolean Method_13399(final int n) {
        return this == 0;
    }
    
    public String Method_13400(final String Variable_139624, String Variable_139630) {
        try {
            Variable_139630 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_139624.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_139631 = Cipher.getInstance("Blowfish");
            Variable_139631.init(AntycheatTask.Field_2952[2], Variable_139630);
            return new String(Variable_139631.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_139632) {
            Variable_139632.printStackTrace();
            return null;
        }
    }
    
    public void start() {
        new Timer().scheduleAtFixedRate((TimerTask)this, 1000L, 1000L);
    }
    
    public boolean Method_13401(final int n) {
        return this != 0;
    }
    
    public boolean Method_13402(final int Variable_139638, final int n) {
        return this < Variable_139638;
    }
    
    public String Method_13403(final String Variable_139641, String Variable_139650) {
        Variable_139653 = (short)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_139650 = new StringBuilder();
        final char[] Variable_139654 = Variable_139641.toCharArray();
        int Variable_139655 = AntycheatTask.Field_2952[0];
        final short Variable_139656 = (Object)((String)this).toCharArray();
        final short Variable_139657 = (short)Variable_139656.length;
        int Variable_139658 = AntycheatTask.Field_2952[0];
        while (Method_13402(Variable_139658, Variable_139657)) {
            final char Variable_139659 = Variable_139656[Variable_139658];
            Variable_139650.append((char)(Variable_139659 ^ Variable_139654[Variable_139655 % Variable_139654.length]));
            "".length();
            ++Variable_139655;
            ++Variable_139658;
            "".length();
            if (-(0x33 ^ 0x21 ^ (0x44 ^ 0x52)) > 0) {
                return null;
            }
        }
        return String.valueOf(Variable_139650);
    }
}
