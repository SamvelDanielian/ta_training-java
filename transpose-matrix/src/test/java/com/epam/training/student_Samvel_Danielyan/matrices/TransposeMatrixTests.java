package com.epam.training.student_Samvel_Danielyan.matrices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTests {
    @Test
    public void test2x2_1() {
        int[][] a = { {1, 2}, {7, -13} };
        int[][] expected = {{1, 7}, {2, -13}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2x2_2() {
        int[][] a = { {-4, -65}, {78, -13} };
        int[][] expected = {{-4, 78}, {-65, -13}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2x3_1() {
        int[][] a = { {-4, -65, 56}, {78, -13, 32} };
        int[][] expected = {{-4, 78}, {-65, -13}, {56, 32}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2x3_2() {
        int[][] a = { {-24853, -643535, 5687654}, {7248, 4213, 32} };
        int[][] expected = {{-24853, 7248}, {-643535, 4213}, {5687654, 32}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3x2_1() {
        int[][] a = { {-643535, 5687654}, {4213, 32}, {-345657, 0} };
        int[][] expected = {{-643535, 4213, -345657}, {5687654, 32, 0}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_1() {
        int[][] a = {{35795383, 22904183, 38480680}, {76532777, 18893082, 61523796}, {65144463, 56506459, 4530414}, {28482669, 37685193, 47628454}, {18281394, 58655699, 94449331}, {91087277, 83314440, 39755506}, {15009372, 19220536, 31996588}};
        int[][] expected = {{35795383, 76532777, 65144463, 28482669, 18281394, 91087277, 15009372}, {22904183, 18893082, 56506459, 37685193, 58655699, 83314440, 19220536}, {38480680, 61523796, 4530414, 47628454, 94449331, 39755506, 31996588}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_2() {
        int[][] a = {{128692, 55617142, 73022910, 21257059, 3848454}, {76344025, 75805987, 68521930, 70676780, 95869894}, {25097305, 36289981, 32566557, 60753189, 74609248}, {93477198, 69926646, 66633652, 53343509, 13718921}};
        int[][] expected = {{128692, 76344025, 25097305, 93477198}, {55617142, 75805987, 36289981, 69926646}, {73022910, 68521930, 32566557, 66633652}, {21257059, 70676780, 60753189, 53343509}, {3848454, 95869894, 74609248, 13718921}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_3() {
        int[][] a = {{44744618, 23787125, 83266047, 94154030, 89215225, 38740067, 62305097, 21244690, 4999802, 58779630, 93095389, 23155041}, {95239441, 69026292, 70704155, 8517654, 10316923, 53553951, 91268015, 81378405, 13147073, 2931348, 99090883, 51455937}, {73403432, 96941550, 53081810, 15702538, 99806153, 87143651, 18152614, 57539182, 45559076, 92234466, 11151784, 43596965}, {33501974, 34848462, 84357123, 53724674, 21484652, 72280988, 16207778, 57503004, 79720209, 7223820, 45720172, 88457858}, {53572955, 37697173, 81481014, 90674245, 70193820, 70627210, 10123993, 56385774, 6159287, 90978294, 70112531, 60430141}, {88694278, 58387509, 9723035, 25230763, 39995722, 59289542, 33591796, 97253628, 35365522, 27324351, 49329708, 65269313}, {73645177, 85300798, 27805935, 21255016, 32308076, 53489120, 66704102, 28705333, 25675737, 11630863, 52248178, 66898467}, {12884071, 2017673, 75069558, 79786566, 954553, 53194038, 65034665, 54799287, 47617130, 80709006, 85516092, 150727}, {61586660, 12867982, 82789431, 78040324, 10480017, 80305951, 37835617, 6119478, 4507315, 41020351, 48100912, 26302956}, {19230110, 76039958, 57782197, 56145043, 88858389, 69185040, 2893469, 62411417, 61276555, 67159506, 93147443, 22566329}, {5336298, 47675751, 6858938, 64137571, 97045617, 7122609, 87231715, 47243086, 22304992, 13278954, 43464931, 79011274}, {3461194, 4459927, 2089074, 34870921, 28319457, 17043142, 82699662, 13451268, 10660219, 69792934, 449042, 9333230}};
        int[][] expected = {{44744618, 95239441, 73403432, 33501974, 53572955, 88694278, 73645177, 12884071, 61586660, 19230110, 5336298, 3461194}, {23787125, 69026292, 96941550, 34848462, 37697173, 58387509, 85300798, 2017673, 12867982, 76039958, 47675751, 4459927}, {83266047, 70704155, 53081810, 84357123, 81481014, 9723035, 27805935, 75069558, 82789431, 57782197, 6858938, 2089074}, {94154030, 8517654, 15702538, 53724674, 90674245, 25230763, 21255016, 79786566, 78040324, 56145043, 64137571, 34870921}, {89215225, 10316923, 99806153, 21484652, 70193820, 39995722, 32308076, 954553, 10480017, 88858389, 97045617, 28319457}, {38740067, 53553951, 87143651, 72280988, 70627210, 59289542, 53489120, 53194038, 80305951, 69185040, 7122609, 17043142}, {62305097, 91268015, 18152614, 16207778, 10123993, 33591796, 66704102, 65034665, 37835617, 2893469, 87231715, 82699662}, {21244690, 81378405, 57539182, 57503004, 56385774, 97253628, 28705333, 54799287, 6119478, 62411417, 47243086, 13451268}, {4999802, 13147073, 45559076, 79720209, 6159287, 35365522, 25675737, 47617130, 4507315, 61276555, 22304992, 10660219}, {58779630, 2931348, 92234466, 7223820, 90978294, 27324351, 11630863, 80709006, 41020351, 67159506, 13278954, 69792934}, {93095389, 99090883, 11151784, 45720172, 70112531, 49329708, 52248178, 85516092, 48100912, 93147443, 43464931, 449042}, {23155041, 51455937, 43596965, 88457858, 60430141, 65269313, 66898467, 150727, 26302956, 22566329, 79011274, 9333230}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_4() {
        int[][] a = {{35505071, 64355659, 68408998, 40849951, 9978686, 68606759, 95850042, 99828162, 51755325, 32674143, 76845288, 53484355, 41043845, 97576698, 72181117, 97260290}, {72254011, 98929549, 35373090, 55079717, 59935221, 53091994, 41419724, 93248335, 58510116, 48116153, 20808409, 97398930, 44161461, 90417993, 64958475, 76120546}};
        int[][] expected = {{35505071, 72254011}, {64355659, 98929549}, {68408998, 35373090}, {40849951, 55079717}, {9978686, 59935221}, {68606759, 53091994}, {95850042, 41419724}, {99828162, 93248335}, {51755325, 58510116}, {32674143, 48116153}, {76845288, 20808409}, {53484355, 97398930}, {41043845, 44161461}, {97576698, 90417993}, {72181117, 64958475}, {97260290, 76120546}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_5() {
        int[][] a = {{88450373, 68666000, 86824756, 52405402, 65320396, 70914752, 80308050}, {35626238, 30008281, 58598791, 70206584, 77500665, 5082796, 72767525}, {71402549, 62802347, 54461354, 35419239, 38854548, 97975678, 3798443}, {46697504, 63063500, 25870478, 15402800, 97349528, 39147860, 75949648}, {32128329, 34567355, 96779016, 95383281, 70875083, 36386094, 90674762}, {71719997, 36931987, 59513768, 94282651, 10862038, 27885086, 21982732}};
        int[][] expected = {{88450373, 35626238, 71402549, 46697504, 32128329, 71719997}, {68666000, 30008281, 62802347, 63063500, 34567355, 36931987}, {86824756, 58598791, 54461354, 25870478, 96779016, 59513768}, {52405402, 70206584, 35419239, 15402800, 95383281, 94282651}, {65320396, 77500665, 38854548, 97349528, 70875083, 10862038}, {70914752, 5082796, 97975678, 39147860, 36386094, 27885086}, {80308050, 72767525, 3798443, 75949648, 90674762, 21982732}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_6() {
        int[][] a = {{91410160, 39319514, 11723940, 58253967, 22147726, 85383168, 21510605, 50804630, 35900592, 99185613, 30973264, 55924203, 10041435, 84781896, 2571140, 68328390}, {3192569, 67462397, 26404675, 29322460, 51529008, 25365170, 33165960, 10345687, 67424670, 31595069, 57402424, 9525475, 2241185, 76734151, 51306380, 10121997}, {82832504, 79680358, 57968623, 87621108, 55040339, 20237247, 49714209, 22393792, 4305300, 50550850, 15609598, 68365244, 68465247, 32432519, 13262108, 37782177}, {33672885, 74627569, 46530434, 42670005, 23859071, 74608075, 2389431, 13127165, 72050189, 21439310, 63623435, 15521184, 3445294, 31706281, 23889420, 50294691}};
        int[][] expected = {{91410160, 3192569, 82832504, 33672885}, {39319514, 67462397, 79680358, 74627569}, {11723940, 26404675, 57968623, 46530434}, {58253967, 29322460, 87621108, 42670005}, {22147726, 51529008, 55040339, 23859071}, {85383168, 25365170, 20237247, 74608075}, {21510605, 33165960, 49714209, 2389431}, {50804630, 10345687, 22393792, 13127165}, {35900592, 67424670, 4305300, 72050189}, {99185613, 31595069, 50550850, 21439310}, {30973264, 57402424, 15609598, 63623435}, {55924203, 9525475, 68365244, 15521184}, {10041435, 2241185, 68465247, 3445294}, {84781896, 76734151, 32432519, 31706281}, {2571140, 51306380, 13262108, 23889420}, {68328390, 10121997, 37782177, 50294691}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_7() {
        int[][] a = {{56735856, 56351780, 64537656, 84667886, 62894022}, {84289738, 84849035, 51210827, 83001765, 55750589}, {42278471, 45422195, 20306032, 37302088, 26624004}, {63443652, 7855320, 50500098, 45538191, 96793358}, {10952385, 65315231, 89938159, 77387857, 60313242}, {78866612, 64736566, 89868924, 32443957, 7111913}, {76737743, 37023520, 5835081, 57854212, 41348178}, {65095481, 36051188, 64306470, 21831327, 7334842}, {78485337, 83892261, 36606803, 75786543, 14763972}, {69995065, 39791260, 13115819, 72843595, 32494842}, {64888157, 24386398, 72652343, 98506769, 57634650}};
        int[][] expected = {{56735856, 84289738, 42278471, 63443652, 10952385, 78866612, 76737743, 65095481, 78485337, 69995065, 64888157}, {56351780, 84849035, 45422195, 7855320, 65315231, 64736566, 37023520, 36051188, 83892261, 39791260, 24386398}, {64537656, 51210827, 20306032, 50500098, 89938159, 89868924, 5835081, 64306470, 36606803, 13115819, 72652343}, {84667886, 83001765, 37302088, 45538191, 77387857, 32443957, 57854212, 21831327, 75786543, 72843595, 98506769}, {62894022, 55750589, 26624004, 96793358, 60313242, 7111913, 41348178, 7334842, 14763972, 32494842, 57634650}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_8() {
        int[][] a = {{64664466, 62393697, 18825734, 73987235, 19140675, 90660117, 48401555, 37719648, 9113827}, {38848580, 54662350, 19957698, 15289733, 67543704, 4820209, 44802482, 15692403, 82717679}, {20639750, 32986159, 93412529, 3419673, 75914043, 13356191, 61322173, 8733559, 57013678}, {72679502, 17175521, 87124834, 56798252, 36131265, 77210217, 92329368, 60131504, 94920547}, {79779302, 94327572, 52879502, 64299222, 87978713, 24290576, 92352451, 62552302, 94753754}, {8945692, 60197591, 66934978, 2178169, 87441593, 65639470, 14685323, 15277653, 11798086}, {91764289, 2700166, 21708892, 74506771, 13434894, 95117514, 73150804, 53130937, 71306968}};
        int[][] expected = {{64664466, 38848580, 20639750, 72679502, 79779302, 8945692, 91764289}, {62393697, 54662350, 32986159, 17175521, 94327572, 60197591, 2700166}, {18825734, 19957698, 93412529, 87124834, 52879502, 66934978, 21708892}, {73987235, 15289733, 3419673, 56798252, 64299222, 2178169, 74506771}, {19140675, 67543704, 75914043, 36131265, 87978713, 87441593, 13434894}, {90660117, 4820209, 13356191, 77210217, 24290576, 65639470, 95117514}, {48401555, 44802482, 61322173, 92329368, 92352451, 14685323, 73150804}, {37719648, 15692403, 8733559, 60131504, 62552302, 15277653, 53130937}, {9113827, 82717679, 57013678, 94920547, 94753754, 11798086, 71306968}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_9() {
        int[][] a = {{40866101, 76471798, 1758754, 22986090, 87664539, 48309181, 75111148}, {21911301, 46914139, 71893536, 89225601, 69185186, 21171183, 73496878}, {20924225, 86938319, 43893919, 23540899, 87307819, 60393426, 3110513}, {6301209, 58409701, 36416018, 14862472, 30910233, 35334542, 73373447}, {99035262, 80117399, 36452620, 29662593, 2411990, 269350, 59954741}};
        int[][] expected = {{40866101, 21911301, 20924225, 6301209, 99035262}, {76471798, 46914139, 86938319, 58409701, 80117399}, {1758754, 71893536, 43893919, 36416018, 36452620}, {22986090, 89225601, 23540899, 14862472, 29662593}, {87664539, 69185186, 87307819, 30910233, 2411990}, {48309181, 21171183, 60393426, 35334542, 269350}, {75111148, 73496878, 3110513, 73373447, 59954741}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testHighRank_10() {
        int[][] a = {{4542427, 64333563, 84430234, 48866727, 81748926, 23489065, 97681341, 68060875, 73411633}, {85233225, 36080086, 9924415, 46080418, 35551520, 12115580, 73498599, 14129343, 78380861}, {79095821, 59136377, 28801965, 95961862, 67465481, 29460864, 74066356, 85951269, 94854150}, {20110616, 75749162, 69513981, 89225104, 22318249, 13653720, 73002351, 3244349, 83883531}, {90993957, 57712854, 32316101, 42185107, 76205595, 74155191, 9438539, 3083896, 39117784}, {92071614, 83711707, 21584110, 98996525, 7544411, 945906, 84338145, 12230392, 36477907}, {95437069, 3493829, 31473143, 96424090, 10465676, 11726036, 18796707, 92006160, 12711017}, {45299793, 33727012, 65970238, 45668783, 72279778, 59720738, 7040614, 9431291, 58507674}, {77555614, 31066188, 47560969, 4685794, 79561139, 17325264, 36107305, 36304177, 8557821}, {21813802, 62571782, 69615142, 69198587, 2742337, 49189420, 5182471, 55437459, 70181312}, {19838132, 24812487, 24431756, 40052253, 22828089, 9752981, 88675929, 69691917, 54052087}};
        int[][] expected = {{4542427, 85233225, 79095821, 20110616, 90993957, 92071614, 95437069, 45299793, 77555614, 21813802, 19838132}, {64333563, 36080086, 59136377, 75749162, 57712854, 83711707, 3493829, 33727012, 31066188, 62571782, 24812487}, {84430234, 9924415, 28801965, 69513981, 32316101, 21584110, 31473143, 65970238, 47560969, 69615142, 24431756}, {48866727, 46080418, 95961862, 89225104, 42185107, 98996525, 96424090, 45668783, 4685794, 69198587, 40052253}, {81748926, 35551520, 67465481, 22318249, 76205595, 7544411, 10465676, 72279778, 79561139, 2742337, 22828089}, {23489065, 12115580, 29460864, 13653720, 74155191, 945906, 11726036, 59720738, 17325264, 49189420, 9752981}, {97681341, 73498599, 74066356, 73002351, 9438539, 84338145, 18796707, 7040614, 36107305, 5182471, 88675929}, {68060875, 14129343, 85951269, 3244349, 3083896, 12230392, 92006160, 9431291, 36304177, 55437459, 69691917}, {73411633, 78380861, 94854150, 83883531, 39117784, 36477907, 12711017, 58507674, 8557821, 70181312, 54052087}};
        int[][] actual = TransposeMatrix.transpose(a);
        Assertions.assertArrayEquals(expected, actual);
    }
}