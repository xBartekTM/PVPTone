package pvptone.utils;

import java.text.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.regex.*;
import java.util.*;

public class DataUtil extends Object<DataUtil>
{
    public SimpleDateFormat dateFormat;
    public LinkedHashMap<Integer, String> values;
    public String[] Field_903;
    public int[] Field_904;
    public SimpleDateFormat timeFormat;
    
    public String getTime(final long n) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Ljava/util/Date;
        //     6: dup            
        //     7: lload_0         /* Variable_42000 */
        //     8: invokespecial   java/util/Date.<init>:(J)V
        //    11: invokevirtual   java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //    14: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.assembler.Collection.get(Collection.java:43)
        //     at java.util.Collections$UnmodifiableList.get(Unknown Source)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.adjustArgumentsForMethodCallCore(AstMethodBodyBuilder.java:1313)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.adjustArgumentsForMethodCall(AstMethodBodyBuilder.java:1286)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1178)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
    
    public String secondsToString(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    java/lang/System.currentTimeMillis:()J
        //     4: lsub           
        //     5: ldc2_w          1000
        //     8: ldiv           
        //     9: l2i            
        //    10: istore_2        /* Variable_42005 */
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: astore_3        /* Variable_42013 */
        //    19: getstatic       pvptone/utils/DataUtil.values:Ljava/util/LinkedHashMap;
        //    22: invokevirtual   java/util/LinkedHashMap.entrySet:()Ljava/util/Set;
        //    25: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    30: astore          Variable_42007
        //    32: ldc             ""
        //    34: invokevirtual   java/lang/String.length:()I
        //    37: pop            
        //    38: bipush          124
        //    40: bipush          120
        //    42: ixor           
        //    43: ineg           
        //    44: iflt            170
        //    47: aconst_null    
        //    48: areturn        
        //    49: aload           Variable_42007
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: checkcast       Ljava/util/Map$Entry;
        //    59: astore          Variable_42001
        //    61: iload_2         /* Variable_42005 */
        //    62: aload           Variable_42001
        //    64: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    69: checkcast       Ljava/lang/Integer;
        //    72: invokevirtual   java/lang/Integer.intValue:()I
        //    75: idiv           
        //    76: istore          Variable_42008
        //    78: iload           Variable_42008
        //    80: getstatic       pvptone/utils/DataUtil.Field_904:[I
        //    83: iconst_1       
        //    84: iaload         
        //    85: invokestatic    pvptone/utils/DataUtil.Method_4123:(II)Z
        //    88: ifeq            170
        //    91: iload           Variable_42008
        //    93: i2d            
        //    94: invokestatic    java/lang/Math.floor:(D)D
        //    97: d2i            
        //    98: istore          Variable_42003
        //   100: aload_3         /* Variable_42010 */
        //   101: new             Ljava/lang/StringBuilder;
        //   104: dup            
        //   105: iload           Variable_42003
        //   107: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   110: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   113: aload           Variable_42001
        //   115: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   120: checkcast       Ljava/lang/String;
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: getstatic       pvptone/utils/DataUtil.Field_903:[Ljava/lang/String;
        //   135: getstatic       pvptone/utils/DataUtil.Field_904:[I
        //   138: bipush          13
        //   140: iaload         
        //   141: aaload         
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: ldc             ""
        //   147: invokevirtual   java/lang/String.length:()I
        //   150: pop2           
        //   151: iload_2         /* Variable_42005 */
        //   152: iload           Variable_42003
        //   154: aload           Variable_42001
        //   156: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   161: checkcast       Ljava/lang/Integer;
        //   164: invokevirtual   java/lang/Integer.intValue:()I
        //   167: imul           
        //   168: isub           
        //   169: istore_2        /* Variable_42005 */
        //   170: aload           Variable_42007
        //   172: invokeinterface java/util/Iterator.hasNext:()Z
        //   177: invokestatic    pvptone/utils/DataUtil.Method_4118:(I)Z
        //   180: ifeq            49
        //   183: aload_3         /* Variable_42010 */
        //   184: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   187: areturn        
        //    StackMapTable: 00 02 FF 00 31 00 05 04 01 07 00 33 00 07 00 4E 00 00 FB 00 78
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public String Method_4113(final String Variable_42015, String Variable_42017) {
        try {
            Variable_42017 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_42015.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_42018 = Cipher.getInstance("Blowfish");
            Variable_42018.init(DataUtil.Field_904[4], Variable_42017);
            return new String(Variable_42018.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_42019) {
            Variable_42019.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_4114(final int n) {
        return this > 0;
    }
    
    public void Method_4115() {
        (DataUtil.Field_903 = new String[DataUtil.Field_904[19]])[DataUtil.Field_904[0]] = Method_4120("BiJRDiB0GRhPbSoORi4AYxMSGjQ=", "NjkcM");
        DataUtil.Field_903[DataUtil.Field_904[1]] = Method_4121("TnAp423ZNEMps7in1+susw==", "rarZX");
        DataUtil.Field_903[DataUtil.Field_904[4]] = Method_4113("z66mVZPwDUc=", "revhM");
        DataUtil.Field_903[DataUtil.Field_904[6]] = Method_4121("3PJ/lwwJPus=", "GkNal");
        DataUtil.Field_903[DataUtil.Field_904[8]] = Method_4113("meV6x+t5LBQ=", "ydDOr");
        DataUtil.Field_903[DataUtil.Field_904[10]] = Method_4121("vp1XuC6fH2Q=", "POsVP");
        DataUtil.Field_903[DataUtil.Field_904[2]] = Method_4113("cKTAIpNktwM=", "fGYlw");
        DataUtil.Field_903[DataUtil.Field_904[12]] = Method_4113("rvmVhC9TGuc=", "phvMn");
        DataUtil.Field_903[DataUtil.Field_904[13]] = Method_4113("aAWFEpb02jo=", "nnHYs");
        DataUtil.Field_903[DataUtil.Field_904[14]] = Method_4121("OrOdQpYUUKI+eewHMtkJpeNMMmzKOZnVadyxjncX/6P+WUKzXstqQgJ3fRpfoPI5YdUwY38K8uZQI/6oW7+7Nr0jPst/Kf04yb1GYVYvrqNPrc8MaVG3MjqznUKWFFCiVPkPl+lpgoHjTDJsyjmZ1WncsY53F/+j/llCs17LakJQTCzBxEnY4Xqrqf5yXmOAxyWa3ViTPXJxccMf0ff2dXeVrj5fxQ5MvnYtbwuiaCxXnkfklYiyK88+2mitZB4r6cu3hTcaNnbzHhO0MTpcog==", "vXwlH");
    }
    
    public long parseDateDiff(final String Variable_42037, final boolean Variable_42032) {
        try {
            final Pattern Variable_42038 = Pattern.compile(DataUtil.Field_903[DataUtil.Field_904[14]], DataUtil.Field_904[4]);
            final Matcher Variable_42039 = Variable_42038.matcher((CharSequence)this);
            int Variable_42040 = DataUtil.Field_904[0];
            int Variable_42041 = DataUtil.Field_904[0];
            int Variable_42042 = DataUtil.Field_904[0];
            int Variable_42043 = DataUtil.Field_904[0];
            int Variable_42044 = DataUtil.Field_904[0];
            int Variable_42045 = DataUtil.Field_904[0];
            int Variable_42046 = DataUtil.Field_904[0];
            boolean Variable_42047 = DataUtil.Field_904[0] != 0;
            "".length();
            if ((0x36 ^ 0x32) <= ((0x23 ^ 0x16) & ~(0xAD ^ 0x98))) {
                return 0L;
            }
            while (!Method_4118(Variable_42039.find() ? 1 : 0)) {
                if (Method_4119(Variable_42039.group()) && Method_4118(Variable_42039.group().isEmpty() ? 1 : 0)) {
                    int Variable_42048 = DataUtil.Field_904[0];
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return 0L;
                    }
                    while (!Method_4123(Variable_42048, Variable_42039.groupCount())) {
                        if (Method_4119(Variable_42039.group(Variable_42048)) && Method_4118(Variable_42039.group(Variable_42048).isEmpty() ? 1 : 0)) {
                            Variable_42047 = (DataUtil.Field_904[1] != 0);
                            "".length();
                            if ((0x8C ^ 0x88) < 0) {
                                return 0L;
                            }
                            break;
                        }
                        else {
                            ++Variable_42048;
                        }
                    }
                    if (Method_4118(Variable_42047 ? 1 : 0)) {
                        "".length();
                        if (null != null) {
                            return 0L;
                        }
                        continue;
                    }
                    else {
                        if (Method_4119(Variable_42039.group(DataUtil.Field_904[1])) && Method_4118(Variable_42039.group(DataUtil.Field_904[1]).isEmpty() ? 1 : 0)) {
                            Variable_42040 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[1]));
                        }
                        if (Method_4119(Variable_42039.group(DataUtil.Field_904[4])) && Method_4118(Variable_42039.group(DataUtil.Field_904[4]).isEmpty() ? 1 : 0)) {
                            Variable_42041 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[4]));
                        }
                        if (Method_4119(Variable_42039.group(DataUtil.Field_904[6])) && Method_4118(Variable_42039.group(DataUtil.Field_904[6]).isEmpty() ? 1 : 0)) {
                            Variable_42042 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[6]));
                        }
                        if (Method_4119(Variable_42039.group(DataUtil.Field_904[8])) && Method_4118(Variable_42039.group(DataUtil.Field_904[8]).isEmpty() ? 1 : 0)) {
                            Variable_42043 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[8]));
                        }
                        if (Method_4119(Variable_42039.group(DataUtil.Field_904[10])) && Method_4118(Variable_42039.group(DataUtil.Field_904[10]).isEmpty() ? 1 : 0)) {
                            Variable_42044 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[10]));
                        }
                        if (Method_4119(Variable_42039.group(DataUtil.Field_904[2])) && Method_4118(Variable_42039.group(DataUtil.Field_904[2]).isEmpty() ? 1 : 0)) {
                            Variable_42045 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[2]));
                        }
                        if (Method_4117(Variable_42039.group(DataUtil.Field_904[12]))) {
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return 0L;
                            }
                            break;
                        }
                        else if (Method_4116(Variable_42039.group(DataUtil.Field_904[12]).isEmpty() ? 1 : 0)) {
                            "".length();
                            if (((0x85 ^ 0xA3 ^ (0xBB ^ 0xA3)) & (0x85 ^ 0xA1 ^ (0x6D ^ 0x77) ^ -" ".length())) != 0x0) {
                                return 0L;
                            }
                            break;
                        }
                        else {
                            Variable_42046 = Integer.parseInt(Variable_42039.group(DataUtil.Field_904[12]));
                            "".length();
                            if (((46 + 111 - 96 + 120 ^ 126 + 54 - 28 + 13) & (0x3C ^ 0x75 ^ (0x1 ^ 0x58) ^ -" ".length())) != 0x0) {
                                return 0L;
                            }
                            break;
                        }
                    }
                }
            }
            if (Method_4118(Variable_42047 ? 1 : 0)) {
                return -1L;
            }
            final Calendar Variable_42049 = new GregorianCalendar();
            if (Method_4114(Variable_42040)) {
                final Calendar calendar = Variable_42049;
                final int n = DataUtil.Field_904[1];
                final int n2 = Variable_42040;
                int n3;
                if (Method_4116((int)Variable_42037)) {
                    n3 = DataUtil.Field_904[1];
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                }
                else {
                    n3 = DataUtil.Field_904[15];
                }
                calendar.add(n, n2 * n3);
            }
            if (Method_4114(Variable_42041)) {
                final Calendar calendar2 = Variable_42049;
                final int n4 = DataUtil.Field_904[4];
                final int n5 = Variable_42041;
                int n6;
                if (Method_4116((int)Variable_42037)) {
                    n6 = DataUtil.Field_904[1];
                    "".length();
                    if ("   ".length() <= 0) {
                        return 0L;
                    }
                }
                else {
                    n6 = DataUtil.Field_904[15];
                }
                calendar2.add(n4, n5 * n6);
            }
            if (Method_4114(Variable_42042)) {
                final Calendar calendar3 = Variable_42049;
                final int n7 = DataUtil.Field_904[6];
                final int n8 = Variable_42042;
                int n9;
                if (Method_4116((int)Variable_42037)) {
                    n9 = DataUtil.Field_904[1];
                    "".length();
                    if ("   ".length() < -" ".length()) {
                        return 0L;
                    }
                }
                else {
                    n9 = DataUtil.Field_904[15];
                }
                calendar3.add(n7, n8 * n9);
            }
            if (Method_4114(Variable_42043)) {
                final Calendar calendar4 = Variable_42049;
                final int n10 = DataUtil.Field_904[10];
                final int n11 = Variable_42043;
                int n12;
                if (Method_4116((int)Variable_42037)) {
                    n12 = DataUtil.Field_904[1];
                    "".length();
                    if ((0x74 ^ 0x70) < 0) {
                        return 0L;
                    }
                }
                else {
                    n12 = DataUtil.Field_904[15];
                }
                calendar4.add(n10, n11 * n12);
            }
            if (Method_4114(Variable_42044)) {
                final Calendar calendar5 = Variable_42049;
                final int n13 = DataUtil.Field_904[16];
                final int n14 = Variable_42044;
                int n15;
                if (Method_4116((int)Variable_42037)) {
                    n15 = DataUtil.Field_904[1];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return 0L;
                    }
                }
                else {
                    n15 = DataUtil.Field_904[15];
                }
                calendar5.add(n13, n14 * n15);
            }
            if (Method_4114(Variable_42045)) {
                final Calendar calendar6 = Variable_42049;
                final int n16 = DataUtil.Field_904[17];
                final int n17 = Variable_42045;
                int n18;
                if (Method_4116((int)Variable_42037)) {
                    n18 = DataUtil.Field_904[1];
                    "".length();
                    if (null != null) {
                        return 0L;
                    }
                }
                else {
                    n18 = DataUtil.Field_904[15];
                }
                calendar6.add(n16, n17 * n18);
            }
            if (Method_4114(Variable_42046)) {
                final Calendar calendar7 = Variable_42049;
                final int n19 = DataUtil.Field_904[18];
                final int n20 = Variable_42046;
                int n21;
                if (Method_4116((int)Variable_42037)) {
                    n21 = DataUtil.Field_904[1];
                    "".length();
                    if (-"  ".length() > 0) {
                        return 0L;
                    }
                }
                else {
                    n21 = DataUtil.Field_904[15];
                }
                calendar7.add(n19, n20 * n21);
            }
            final Calendar Variable_42050 = new GregorianCalendar();
            Variable_42050.add(DataUtil.Field_904[1], DataUtil.Field_904[19]);
            if (Method_4116(Variable_42049.after(Variable_42050) ? 1 : 0)) {
                return Variable_42050.getTimeInMillis();
            }
            return Variable_42049.getTimeInMillis();
        }
        catch (Exception Variable_42051) {
            return -1L;
        }
    }
    
    public boolean Method_4116(final int n) {
        return this != 0;
    }
    
    public boolean Method_4117(final Object o) {
        return this == null;
    }
    
    public boolean Method_4118(final int n) {
        return this == 0;
    }
    
    static {
        Method_4122();
        Method_4115();
        DataUtil.dateFormat = new SimpleDateFormat(DataUtil.Field_903[DataUtil.Field_904[0]]);
        DataUtil.timeFormat = new SimpleDateFormat(DataUtil.Field_903[DataUtil.Field_904[1]]);
        (DataUtil.values = new LinkedHashMap<Integer, String>(DataUtil.Field_904[2])).put(DataUtil.Field_904[3], DataUtil.Field_903[DataUtil.Field_904[4]]);
        "".length();
        DataUtil.values.put(DataUtil.Field_904[5], DataUtil.Field_903[DataUtil.Field_904[6]]);
        "".length();
        DataUtil.values.put(DataUtil.Field_904[7], DataUtil.Field_903[DataUtil.Field_904[8]]);
        "".length();
        DataUtil.values.put(DataUtil.Field_904[9], DataUtil.Field_903[DataUtil.Field_904[10]]);
        "".length();
        DataUtil.values.put(DataUtil.Field_904[11], DataUtil.Field_903[DataUtil.Field_904[2]]);
        "".length();
        DataUtil.values.put(DataUtil.Field_904[1], DataUtil.Field_903[DataUtil.Field_904[12]]);
        "".length();
    }
    
    public boolean Method_4119(final Object o) {
        return this != null;
    }
    
    public String Method_4120(final String Variable_42067, String Variable_42068) {
        Variable_42065 = (boolean)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_42068 = new StringBuilder();
        final char[] Variable_42069 = Variable_42067.toCharArray();
        int Variable_42070 = DataUtil.Field_904[0];
        final char Variable_42071 = (Object)((String)this).toCharArray();
        final String Variable_42072 = (String)Variable_42071.length;
        double Variable_42073 = DataUtil.Field_904[0];
        while (Method_4124((int)Variable_42073, (int)Variable_42072)) {
            final char Variable_42074 = Variable_42071[Variable_42073];
            Variable_42068.append((char)(Variable_42074 ^ Variable_42069[Variable_42070 % Variable_42069.length]));
            "".length();
            ++Variable_42070;
            ++Variable_42073;
            "".length();
            if (((0x43 ^ 0x21) & ~(0x4A ^ 0x28)) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_42068);
    }
    
    public String Method_4121(final String Variable_42076, String Variable_42074) {
        try {
            Variable_42074 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_42076.getBytes(StandardCharsets.UTF_8)), DataUtil.Field_904[13]), "DES");
            final Cipher Variable_42077 = Cipher.getInstance("DES");
            Variable_42077.init(DataUtil.Field_904[4], Variable_42074);
            return new String(Variable_42077.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_42078) {
            Variable_42078.printStackTrace();
            return null;
        }
    }
    
    public void Method_4122() {
        (DataUtil.Field_904 = new int[20])[0] = ((130 + 43 - 58 + 25 ^ 141 + 135 - 237 + 117) & (0xAB ^ 0x93 ^ (0x57 ^ 0x7F) ^ -" ".length()));
        DataUtil.Field_904[1] = " ".length();
        DataUtil.Field_904[2] = (0x1D ^ 0x1B);
        DataUtil.Field_904[3] = (0xFFFFDE82 & 0x1DABD7D);
        DataUtil.Field_904[4] = "  ".length();
        DataUtil.Field_904[5] = (-(0xFFFFFFDF & 0x72F7) & (0xFFFFFFF6 & 0x27FFDF));
        DataUtil.Field_904[6] = "   ".length();
        DataUtil.Field_904[7] = (-(0xFFFFCBF3 & 0x3E7F) & (0xFFFFDBF6 & 0x17FFB));
        DataUtil.Field_904[8] = (0xB6 ^ 0xB2);
        DataUtil.Field_904[9] = (0xFFFF8E57 & 0x7FB8);
        DataUtil.Field_904[10] = (0xA8 ^ 0xAD);
        DataUtil.Field_904[11] = (87 + 69 - 84 + 64 ^ 37 + 115 - 128 + 156);
        DataUtil.Field_904[12] = (0xAA ^ 0xAD);
        DataUtil.Field_904[13] = (0x9E ^ 0x96);
        DataUtil.Field_904[14] = (39 + 71 + 34 + 0 ^ 43 + 130 - 130 + 110);
        DataUtil.Field_904[15] = -" ".length();
        DataUtil.Field_904[16] = (0x6D ^ 0x4B ^ (0x63 ^ 0x4E));
        DataUtil.Field_904[17] = (0xAD ^ 0xA1);
        DataUtil.Field_904[18] = (0x66 ^ 0x2B ^ (0xF7 ^ 0xB7));
        DataUtil.Field_904[19] = (0x64 ^ 0x6E);
    }
    
    public String getDate(final long n) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Ljava/util/Date;
        //     6: dup            
        //     7: lload_0         /* Variable_42083 */
        //     8: invokespecial   java/util/Date.<init>:(J)V
        //    11: invokevirtual   java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //    14: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.assembler.Collection.get(Collection.java:43)
        //     at java.util.Collections$UnmodifiableList.get(Unknown Source)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.adjustArgumentsForMethodCallCore(AstMethodBodyBuilder.java:1313)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.adjustArgumentsForMethodCall(AstMethodBodyBuilder.java:1286)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1178)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
    
    public boolean Method_4123(final int Variable_42084, final int n) {
        return this >= Variable_42084;
    }
    
    public boolean Method_4124(final int Variable_42086, final int n) {
        return this < Variable_42086;
    }
}
