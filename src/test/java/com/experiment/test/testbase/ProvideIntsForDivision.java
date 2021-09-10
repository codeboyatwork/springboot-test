package com.experiment.test.testbase;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class ProvideIntsForDivision implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
				Arguments.of(2,1,2),
				Arguments.of(6,2,3),
				Arguments.of(12,3,4),
				Arguments.of(20,4,5),
				Arguments.of(10,5,2),
				Arguments.of(18,6,3),
				Arguments.of(28,7,4),
				Arguments.of(40,8,5),
				Arguments.of(18,9,2),
				Arguments.of(30,10,3),
				Arguments.of(44,11,4),
				Arguments.of(60,12,5),
				Arguments.of(26,13,2),
				Arguments.of(42,14,3),
				Arguments.of(60,15,4),
				Arguments.of(80,16,5),
				Arguments.of(34,17,2),
				Arguments.of(54,18,3),
				Arguments.of(76,19,4),
				Arguments.of(100,20,5),
				Arguments.of(42,21,2),
				Arguments.of(66,22,3),
				Arguments.of(92,23,4),
				Arguments.of(120,24,5),
				Arguments.of(50,25,2),
				Arguments.of(78,26,3),
				Arguments.of(108,27,4),
				Arguments.of(140,28,5),
				Arguments.of(58,29,2),
				Arguments.of(90,30,3),
				Arguments.of(124,31,4),
				Arguments.of(160,32,5),
				Arguments.of(66,33,2),
				Arguments.of(102,34,3),
				Arguments.of(140,35,4),
				Arguments.of(180,36,5),
				Arguments.of(74,37,2),
				Arguments.of(114,38,3),
				Arguments.of(156,39,4),
				Arguments.of(200,40,5),
				Arguments.of(82,41,2),
				Arguments.of(126,42,3),
				Arguments.of(172,43,4),
				Arguments.of(220,44,5),
				Arguments.of(90,45,2),
				Arguments.of(138,46,3),
				Arguments.of(188,47,4),
				Arguments.of(240,48,5),
				Arguments.of(98,49,2),
				Arguments.of(150,50,3),
				Arguments.of(204,51,4),
				Arguments.of(260,52,5),
				Arguments.of(106,53,2),
				Arguments.of(162,54,3),
				Arguments.of(220,55,4),
				Arguments.of(280,56,5),
				Arguments.of(114,57,2),
				Arguments.of(174,58,3),
				Arguments.of(236,59,4),
				Arguments.of(300,60,5),
				Arguments.of(122,61,2),
				Arguments.of(186,62,3),
				Arguments.of(252,63,4),
				Arguments.of(320,64,5),
				Arguments.of(130,65,2),
				Arguments.of(198,66,3),
				Arguments.of(268,67,4),
				Arguments.of(340,68,5),
				Arguments.of(138,69,2),
				Arguments.of(210,70,3),
				Arguments.of(284,71,4),
				Arguments.of(360,72,5),
				Arguments.of(146,73,2),
				Arguments.of(222,74,3),
				Arguments.of(300,75,4),
				Arguments.of(380,76,5),
				Arguments.of(154,77,2),
				Arguments.of(234,78,3),
				Arguments.of(316,79,4),
				Arguments.of(400,80,5),
				Arguments.of(162,81,2),
				Arguments.of(246,82,3),
				Arguments.of(332,83,4),
				Arguments.of(420,84,5),
				Arguments.of(170,85,2),
				Arguments.of(258,86,3),
				Arguments.of(348,87,4),
				Arguments.of(440,88,5),
				Arguments.of(178,89,2),
				Arguments.of(270,90,3),
				Arguments.of(364,91,4),
				Arguments.of(460,92,5),
				Arguments.of(186,93,2),
				Arguments.of(282,94,3),
				Arguments.of(380,95,4),
				Arguments.of(480,96,5),
				Arguments.of(194,97,2),
				Arguments.of(294,98,3),
				Arguments.of(396,99,4),
				Arguments.of(500,100,5),
				Arguments.of(202,101,2),
				Arguments.of(306,102,3),
				Arguments.of(412,103,4),
				Arguments.of(520,104,5),
				Arguments.of(210,105,2),
				Arguments.of(318,106,3),
				Arguments.of(428,107,4),
				Arguments.of(540,108,5),
				Arguments.of(218,109,2),
				Arguments.of(330,110,3),
				Arguments.of(444,111,4),
				Arguments.of(560,112,5),
				Arguments.of(226,113,2),
				Arguments.of(342,114,3),
				Arguments.of(460,115,4),
				Arguments.of(580,116,5),
				Arguments.of(234,117,2),
				Arguments.of(354,118,3),
				Arguments.of(476,119,4),
				Arguments.of(600,120,5),
				Arguments.of(242,121,2),
				Arguments.of(366,122,3),
				Arguments.of(492,123,4),
				Arguments.of(620,124,5),
				Arguments.of(250,125,2),
				Arguments.of(378,126,3),
				Arguments.of(508,127,4),
				Arguments.of(640,128,5),
				Arguments.of(258,129,2),
				Arguments.of(390,130,3),
				Arguments.of(524,131,4),
				Arguments.of(660,132,5),
				Arguments.of(266,133,2),
				Arguments.of(402,134,3),
				Arguments.of(540,135,4),
				Arguments.of(680,136,5),
				Arguments.of(274,137,2),
				Arguments.of(414,138,3),
				Arguments.of(556,139,4),
				Arguments.of(700,140,5),
				Arguments.of(282,141,2),
				Arguments.of(426,142,3),
				Arguments.of(572,143,4),
				Arguments.of(720,144,5),
				Arguments.of(290,145,2),
				Arguments.of(438,146,3),
				Arguments.of(588,147,4),
				Arguments.of(740,148,5),
				Arguments.of(298,149,2),
				Arguments.of(450,150,3),
				Arguments.of(604,151,4),
				Arguments.of(760,152,5),
				Arguments.of(306,153,2),
				Arguments.of(462,154,3),
				Arguments.of(620,155,4),
				Arguments.of(780,156,5),
				Arguments.of(314,157,2),
				Arguments.of(474,158,3),
				Arguments.of(636,159,4),
				Arguments.of(800,160,5),
				Arguments.of(322,161,2),
				Arguments.of(486,162,3),
				Arguments.of(652,163,4),
				Arguments.of(820,164,5),
				Arguments.of(330,165,2),
				Arguments.of(498,166,3),
				Arguments.of(668,167,4),
				Arguments.of(840,168,5),
				Arguments.of(338,169,2),
				Arguments.of(510,170,3),
				Arguments.of(684,171,4),
				Arguments.of(860,172,5),
				Arguments.of(346,173,2),
				Arguments.of(522,174,3),
				Arguments.of(700,175,4),
				Arguments.of(880,176,5),
				Arguments.of(354,177,2),
				Arguments.of(534,178,3),
				Arguments.of(716,179,4),
				Arguments.of(900,180,5),
				Arguments.of(362,181,2),
				Arguments.of(546,182,3),
				Arguments.of(732,183,4),
				Arguments.of(920,184,5),
				Arguments.of(370,185,2),
				Arguments.of(558,186,3),
				Arguments.of(748,187,4),
				Arguments.of(940,188,5),
				Arguments.of(378,189,2),
				Arguments.of(570,190,3),
				Arguments.of(764,191,4),
				Arguments.of(960,192,5),
				Arguments.of(386,193,2),
				Arguments.of(582,194,3),
				Arguments.of(780,195,4),
				Arguments.of(980,196,5),
				Arguments.of(394,197,2),
				Arguments.of(594,198,3),
				Arguments.of(796,199,4),
				Arguments.of(1000,200,5),
				Arguments.of(402,201,2),
				Arguments.of(606,202,3),
				Arguments.of(812,203,4),
				Arguments.of(1020,204,5),
				Arguments.of(410,205,2),
				Arguments.of(618,206,3),
				Arguments.of(828,207,4),
				Arguments.of(1040,208,5),
				Arguments.of(418,209,2),
				Arguments.of(630,210,3),
				Arguments.of(844,211,4),
				Arguments.of(1060,212,5),
				Arguments.of(426,213,2),
				Arguments.of(642,214,3),
				Arguments.of(860,215,4),
				Arguments.of(1080,216,5),
				Arguments.of(434,217,2),
				Arguments.of(654,218,3),
				Arguments.of(876,219,4),
				Arguments.of(1100,220,5),
				Arguments.of(442,221,2),
				Arguments.of(666,222,3),
				Arguments.of(892,223,4),
				Arguments.of(1120,224,5),
				Arguments.of(450,225,2),
				Arguments.of(678,226,3),
				Arguments.of(908,227,4),
				Arguments.of(1140,228,5),
				Arguments.of(458,229,2),
				Arguments.of(690,230,3),
				Arguments.of(924,231,4),
				Arguments.of(1160,232,5),
				Arguments.of(466,233,2),
				Arguments.of(702,234,3),
				Arguments.of(940,235,4),
				Arguments.of(1180,236,5),
				Arguments.of(474,237,2),
				Arguments.of(714,238,3),
				Arguments.of(956,239,4),
				Arguments.of(1200,240,5),
				Arguments.of(482,241,2),
				Arguments.of(726,242,3),
				Arguments.of(972,243,4),
				Arguments.of(1220,244,5),
				Arguments.of(490,245,2),
				Arguments.of(738,246,3),
				Arguments.of(988,247,4),
				Arguments.of(1240,248,5),
				Arguments.of(498,249,2),
				Arguments.of(750,250,3),
				Arguments.of(1004,251,4),
				Arguments.of(1260,252,5),
				Arguments.of(506,253,2),
				Arguments.of(762,254,3),
				Arguments.of(1020,255,4),
				Arguments.of(1280,256,5),
				Arguments.of(514,257,2),
				Arguments.of(774,258,3),
				Arguments.of(1036,259,4),
				Arguments.of(1300,260,5),
				Arguments.of(522,261,2),
				Arguments.of(786,262,3),
				Arguments.of(1052,263,4),
				Arguments.of(1320,264,5),
				Arguments.of(530,265,2),
				Arguments.of(798,266,3),
				Arguments.of(1068,267,4),
				Arguments.of(1340,268,5),
				Arguments.of(538,269,2),
				Arguments.of(810,270,3),
				Arguments.of(1084,271,4),
				Arguments.of(1360,272,5),
				Arguments.of(546,273,2),
				Arguments.of(822,274,3),
				Arguments.of(1100,275,4),
				Arguments.of(1380,276,5),
				Arguments.of(554,277,2),
				Arguments.of(834,278,3),
				Arguments.of(1116,279,4),
				Arguments.of(1400,280,5),
				Arguments.of(562,281,2),
				Arguments.of(846,282,3),
				Arguments.of(1132,283,4),
				Arguments.of(1420,284,5),
				Arguments.of(570,285,2),
				Arguments.of(858,286,3),
				Arguments.of(1148,287,4),
				Arguments.of(1440,288,5),
				Arguments.of(578,289,2),
				Arguments.of(870,290,3),
				Arguments.of(1164,291,4),
				Arguments.of(1460,292,5),
				Arguments.of(586,293,2),
				Arguments.of(882,294,3),
				Arguments.of(1180,295,4),
				Arguments.of(1480,296,5),
				Arguments.of(594,297,2),
				Arguments.of(894,298,3),
				Arguments.of(1196,299,4),
				Arguments.of(1500,300,5),
				Arguments.of(602,301,2),
				Arguments.of(906,302,3),
				Arguments.of(1212,303,4),
				Arguments.of(1520,304,5),
				Arguments.of(610,305,2),
				Arguments.of(918,306,3),
				Arguments.of(1228,307,4),
				Arguments.of(1540,308,5),
				Arguments.of(618,309,2),
				Arguments.of(930,310,3),
				Arguments.of(1244,311,4),
				Arguments.of(1560,312,5),
				Arguments.of(626,313,2),
				Arguments.of(942,314,3),
				Arguments.of(1260,315,4),
				Arguments.of(1580,316,5),
				Arguments.of(634,317,2),
				Arguments.of(954,318,3),
				Arguments.of(1276,319,4),
				Arguments.of(1600,320,5),
				Arguments.of(642,321,2),
				Arguments.of(966,322,3),
				Arguments.of(1292,323,4),
				Arguments.of(1620,324,5),
				Arguments.of(650,325,2),
				Arguments.of(978,326,3),
				Arguments.of(1308,327,4),
				Arguments.of(1640,328,5),
				Arguments.of(658,329,2),
				Arguments.of(990,330,3),
				Arguments.of(1324,331,4),
				Arguments.of(1660,332,5),
				Arguments.of(666,333,2),
				Arguments.of(1002,334,3),
				Arguments.of(1340,335,4),
				Arguments.of(1680,336,5),
				Arguments.of(674,337,2),
				Arguments.of(1014,338,3),
				Arguments.of(1356,339,4),
				Arguments.of(1700,340,5),
				Arguments.of(682,341,2),
				Arguments.of(1026,342,3),
				Arguments.of(1372,343,4),
				Arguments.of(1720,344,5),
				Arguments.of(690,345,2),
				Arguments.of(1038,346,3),
				Arguments.of(1388,347,4),
				Arguments.of(1740,348,5),
				Arguments.of(698,349,2),
				Arguments.of(1050,350,3),
				Arguments.of(1404,351,4),
				Arguments.of(1760,352,5),
				Arguments.of(706,353,2),
				Arguments.of(1062,354,3),
				Arguments.of(1420,355,4),
				Arguments.of(1780,356,5),
				Arguments.of(714,357,2),
				Arguments.of(1074,358,3),
				Arguments.of(1436,359,4),
				Arguments.of(1800,360,5),
				Arguments.of(722,361,2),
				Arguments.of(1086,362,3),
				Arguments.of(1452,363,4),
				Arguments.of(1820,364,5),
				Arguments.of(730,365,2),
				Arguments.of(1098,366,3),
				Arguments.of(1468,367,4),
				Arguments.of(1840,368,5),
				Arguments.of(738,369,2),
				Arguments.of(1110,370,3),
				Arguments.of(1484,371,4),
				Arguments.of(1860,372,5),
				Arguments.of(746,373,2),
				Arguments.of(1122,374,3),
				Arguments.of(1500,375,4),
				Arguments.of(1880,376,5),
				Arguments.of(754,377,2),
				Arguments.of(1134,378,3),
				Arguments.of(1516,379,4),
				Arguments.of(1900,380,5),
				Arguments.of(762,381,2),
				Arguments.of(1146,382,3),
				Arguments.of(1532,383,4),
				Arguments.of(1920,384,5),
				Arguments.of(770,385,2),
				Arguments.of(1158,386,3),
				Arguments.of(1548,387,4),
				Arguments.of(1940,388,5),
				Arguments.of(778,389,2),
				Arguments.of(1170,390,3),
				Arguments.of(1564,391,4),
				Arguments.of(1960,392,5),
				Arguments.of(786,393,2),
				Arguments.of(1182,394,3),
				Arguments.of(1580,395,4),
				Arguments.of(1980,396,5),
				Arguments.of(794,397,2),
				Arguments.of(1194,398,3),
				Arguments.of(1596,399,4),
				Arguments.of(2000,400,5),
				Arguments.of(802,401,2),
				Arguments.of(1206,402,3),
				Arguments.of(1612,403,4),
				Arguments.of(2020,404,5),
				Arguments.of(810,405,2),
				Arguments.of(1218,406,3),
				Arguments.of(1628,407,4),
				Arguments.of(2040,408,5),
				Arguments.of(818,409,2),
				Arguments.of(1230,410,3),
				Arguments.of(1644,411,4),
				Arguments.of(2060,412,5),
				Arguments.of(826,413,2),
				Arguments.of(1242,414,3),
				Arguments.of(1660,415,4),
				Arguments.of(2080,416,5),
				Arguments.of(834,417,2),
				Arguments.of(1254,418,3),
				Arguments.of(1676,419,4),
				Arguments.of(2100,420,5),
				Arguments.of(842,421,2),
				Arguments.of(1266,422,3),
				Arguments.of(1692,423,4),
				Arguments.of(2120,424,5),
				Arguments.of(850,425,2),
				Arguments.of(1278,426,3),
				Arguments.of(1708,427,4),
				Arguments.of(2140,428,5),
				Arguments.of(858,429,2),
				Arguments.of(1290,430,3),
				Arguments.of(1724,431,4),
				Arguments.of(2160,432,5),
				Arguments.of(866,433,2),
				Arguments.of(1302,434,3),
				Arguments.of(1740,435,4),
				Arguments.of(2180,436,5),
				Arguments.of(874,437,2),
				Arguments.of(1314,438,3),
				Arguments.of(1756,439,4),
				Arguments.of(2200,440,5),
				Arguments.of(882,441,2),
				Arguments.of(1326,442,3),
				Arguments.of(1772,443,4),
				Arguments.of(2220,444,5),
				Arguments.of(890,445,2),
				Arguments.of(1338,446,3),
				Arguments.of(1788,447,4),
				Arguments.of(2240,448,5),
				Arguments.of(898,449,2),
				Arguments.of(1350,450,3),
				Arguments.of(1804,451,4),
				Arguments.of(2260,452,5),
				Arguments.of(906,453,2),
				Arguments.of(1362,454,3),
				Arguments.of(1820,455,4),
				Arguments.of(2280,456,5),
				Arguments.of(914,457,2),
				Arguments.of(1374,458,3),
				Arguments.of(1836,459,4),
				Arguments.of(2300,460,5),
				Arguments.of(922,461,2),
				Arguments.of(1386,462,3),
				Arguments.of(1852,463,4),
				Arguments.of(2320,464,5),
				Arguments.of(930,465,2),
				Arguments.of(1398,466,3),
				Arguments.of(1868,467,4),
				Arguments.of(2340,468,5),
				Arguments.of(938,469,2),
				Arguments.of(1410,470,3),
				Arguments.of(1884,471,4),
				Arguments.of(2360,472,5),
				Arguments.of(946,473,2),
				Arguments.of(1422,474,3),
				Arguments.of(1900,475,4),
				Arguments.of(2380,476,5),
				Arguments.of(954,477,2),
				Arguments.of(1434,478,3),
				Arguments.of(1916,479,4),
				Arguments.of(2400,480,5),
				Arguments.of(962,481,2),
				Arguments.of(1446,482,3),
				Arguments.of(1932,483,4),
				Arguments.of(2420,484,5),
				Arguments.of(970,485,2),
				Arguments.of(1458,486,3),
				Arguments.of(1948,487,4),
				Arguments.of(2440,488,5),
				Arguments.of(978,489,2),
				Arguments.of(1470,490,3),
				Arguments.of(1964,491,4),
				Arguments.of(2460,492,5),
				Arguments.of(986,493,2),
				Arguments.of(1482,494,3),
				Arguments.of(1980,495,4),
				Arguments.of(2480,496,5),
				Arguments.of(994,497,2),
				Arguments.of(1494,498,3),
				Arguments.of(1996,499,4),
				Arguments.of(2500,500,5),
				Arguments.of(1002,501,2),
				Arguments.of(1506,502,3),
				Arguments.of(2012,503,4),
				Arguments.of(2520,504,5),
				Arguments.of(1010,505,2),
				Arguments.of(1518,506,3),
				Arguments.of(2028,507,4),
				Arguments.of(2540,508,5),
				Arguments.of(1018,509,2),
				Arguments.of(1530,510,3),
				Arguments.of(2044,511,4),
				Arguments.of(2560,512,5),
				Arguments.of(1026,513,2),
				Arguments.of(1542,514,3),
				Arguments.of(2060,515,4),
				Arguments.of(2580,516,5),
				Arguments.of(1034,517,2),
				Arguments.of(1554,518,3),
				Arguments.of(2076,519,4),
				Arguments.of(2600,520,5),
				Arguments.of(1042,521,2),
				Arguments.of(1566,522,3),
				Arguments.of(2092,523,4),
				Arguments.of(2620,524,5),
				Arguments.of(1050,525,2),
				Arguments.of(1578,526,3),
				Arguments.of(2108,527,4),
				Arguments.of(2640,528,5),
				Arguments.of(1058,529,2),
				Arguments.of(1590,530,3),
				Arguments.of(2124,531,4),
				Arguments.of(2660,532,5),
				Arguments.of(1066,533,2),
				Arguments.of(1602,534,3),
				Arguments.of(2140,535,4),
				Arguments.of(2680,536,5),
				Arguments.of(1074,537,2),
				Arguments.of(1614,538,3),
				Arguments.of(2156,539,4),
				Arguments.of(2700,540,5),
				Arguments.of(1082,541,2),
				Arguments.of(1626,542,3),
				Arguments.of(2172,543,4),
				Arguments.of(2720,544,5),
				Arguments.of(1090,545,2),
				Arguments.of(1638,546,3),
				Arguments.of(2188,547,4),
				Arguments.of(2740,548,5),
				Arguments.of(1098,549,2),
				Arguments.of(1650,550,3),
				Arguments.of(2204,551,4),
				Arguments.of(2760,552,5),
				Arguments.of(1106,553,2),
				Arguments.of(1662,554,3),
				Arguments.of(2220,555,4),
				Arguments.of(2780,556,5),
				Arguments.of(1114,557,2),
				Arguments.of(1674,558,3),
				Arguments.of(2236,559,4),
				Arguments.of(2800,560,5),
				Arguments.of(1122,561,2),
				Arguments.of(1686,562,3),
				Arguments.of(2252,563,4),
				Arguments.of(2820,564,5),
				Arguments.of(1130,565,2),
				Arguments.of(1698,566,3),
				Arguments.of(2268,567,4),
				Arguments.of(2840,568,5),
				Arguments.of(1138,569,2),
				Arguments.of(1710,570,3),
				Arguments.of(2284,571,4),
				Arguments.of(2860,572,5),
				Arguments.of(1146,573,2),
				Arguments.of(1722,574,3),
				Arguments.of(2300,575,4),
				Arguments.of(2880,576,5),
				Arguments.of(1154,577,2),
				Arguments.of(1734,578,3),
				Arguments.of(2316,579,4),
				Arguments.of(2900,580,5),
				Arguments.of(1162,581,2),
				Arguments.of(1746,582,3),
				Arguments.of(2332,583,4),
				Arguments.of(2920,584,5),
				Arguments.of(1170,585,2),
				Arguments.of(1758,586,3),
				Arguments.of(2348,587,4),
				Arguments.of(2940,588,5),
				Arguments.of(1178,589,2),
				Arguments.of(1770,590,3),
				Arguments.of(2364,591,4),
				Arguments.of(2960,592,5),
				Arguments.of(1186,593,2),
				Arguments.of(1782,594,3),
				Arguments.of(2380,595,4),
				Arguments.of(2980,596,5),
				Arguments.of(1194,597,2),
				Arguments.of(1794,598,3),
				Arguments.of(2396,599,4),
				Arguments.of(3000,600,5),
				Arguments.of(1202,601,2),
				Arguments.of(1806,602,3),
				Arguments.of(2412,603,4),
				Arguments.of(3020,604,5),
				Arguments.of(1210,605,2),
				Arguments.of(1818,606,3),
				Arguments.of(2428,607,4),
				Arguments.of(3040,608,5),
				Arguments.of(1218,609,2),
				Arguments.of(1830,610,3),
				Arguments.of(2444,611,4),
				Arguments.of(3060,612,5),
				Arguments.of(1226,613,2),
				Arguments.of(1842,614,3),
				Arguments.of(2460,615,4),
				Arguments.of(3080,616,5),
				Arguments.of(1234,617,2),
				Arguments.of(1854,618,3),
				Arguments.of(2476,619,4),
				Arguments.of(3100,620,5),
				Arguments.of(1242,621,2),
				Arguments.of(1866,622,3),
				Arguments.of(2492,623,4),
				Arguments.of(3120,624,5),
				Arguments.of(1250,625,2),
				Arguments.of(1878,626,3),
				Arguments.of(2508,627,4),
				Arguments.of(3140,628,5),
				Arguments.of(1258,629,2),
				Arguments.of(1890,630,3),
				Arguments.of(2524,631,4),
				Arguments.of(3160,632,5),
				Arguments.of(1266,633,2),
				Arguments.of(1902,634,3),
				Arguments.of(2540,635,4),
				Arguments.of(3180,636,5),
				Arguments.of(1274,637,2),
				Arguments.of(1914,638,3),
				Arguments.of(2556,639,4),
				Arguments.of(3200,640,5),
				Arguments.of(1282,641,2),
				Arguments.of(1926,642,3),
				Arguments.of(2572,643,4),
				Arguments.of(3220,644,5),
				Arguments.of(1290,645,2),
				Arguments.of(1938,646,3),
				Arguments.of(2588,647,4),
				Arguments.of(3240,648,5),
				Arguments.of(1298,649,2),
				Arguments.of(1950,650,3),
				Arguments.of(2604,651,4),
				Arguments.of(3260,652,5),
				Arguments.of(1306,653,2),
				Arguments.of(1962,654,3),
				Arguments.of(2620,655,4),
				Arguments.of(3280,656,5),
				Arguments.of(1314,657,2),
				Arguments.of(1974,658,3),
				Arguments.of(2636,659,4),
				Arguments.of(3300,660,5),
				Arguments.of(1322,661,2),
				Arguments.of(1986,662,3),
				Arguments.of(2652,663,4),
				Arguments.of(3320,664,5),
				Arguments.of(1330,665,2),
				Arguments.of(1998,666,3),
				Arguments.of(2668,667,4),
				Arguments.of(3340,668,5),
				Arguments.of(1338,669,2),
				Arguments.of(2010,670,3),
				Arguments.of(2684,671,4),
				Arguments.of(3360,672,5),
				Arguments.of(1346,673,2),
				Arguments.of(2022,674,3),
				Arguments.of(2700,675,4),
				Arguments.of(3380,676,5),
				Arguments.of(1354,677,2),
				Arguments.of(2034,678,3),
				Arguments.of(2716,679,4),
				Arguments.of(3400,680,5),
				Arguments.of(1362,681,2),
				Arguments.of(2046,682,3),
				Arguments.of(2732,683,4),
				Arguments.of(3420,684,5),
				Arguments.of(1370,685,2),
				Arguments.of(2058,686,3),
				Arguments.of(2748,687,4),
				Arguments.of(3440,688,5),
				Arguments.of(1378,689,2),
				Arguments.of(2070,690,3),
				Arguments.of(2764,691,4),
				Arguments.of(3460,692,5),
				Arguments.of(1386,693,2),
				Arguments.of(2082,694,3),
				Arguments.of(2780,695,4),
				Arguments.of(3480,696,5),
				Arguments.of(1394,697,2),
				Arguments.of(2094,698,3),
				Arguments.of(2796,699,4),
				Arguments.of(3500,700,5),
				Arguments.of(1402,701,2),
				Arguments.of(2106,702,3),
				Arguments.of(2812,703,4),
				Arguments.of(3520,704,5),
				Arguments.of(1410,705,2),
				Arguments.of(2118,706,3),
				Arguments.of(2828,707,4),
				Arguments.of(3540,708,5),
				Arguments.of(1418,709,2),
				Arguments.of(2130,710,3),
				Arguments.of(2844,711,4),
				Arguments.of(3560,712,5),
				Arguments.of(1426,713,2),
				Arguments.of(2142,714,3),
				Arguments.of(2860,715,4),
				Arguments.of(3580,716,5),
				Arguments.of(1434,717,2),
				Arguments.of(2154,718,3),
				Arguments.of(2876,719,4),
				Arguments.of(3600,720,5),
				Arguments.of(1442,721,2),
				Arguments.of(2166,722,3),
				Arguments.of(2892,723,4),
				Arguments.of(3620,724,5),
				Arguments.of(1450,725,2),
				Arguments.of(2178,726,3),
				Arguments.of(2908,727,4),
				Arguments.of(3640,728,5),
				Arguments.of(1458,729,2),
				Arguments.of(2190,730,3),
				Arguments.of(2924,731,4),
				Arguments.of(3660,732,5),
				Arguments.of(1466,733,2),
				Arguments.of(2202,734,3),
				Arguments.of(2940,735,4),
				Arguments.of(3680,736,5),
				Arguments.of(1474,737,2),
				Arguments.of(2214,738,3),
				Arguments.of(2956,739,4),
				Arguments.of(3700,740,5),
				Arguments.of(1482,741,2),
				Arguments.of(2226,742,3),
				Arguments.of(2972,743,4),
				Arguments.of(3720,744,5),
				Arguments.of(1490,745,2),
				Arguments.of(2238,746,3),
				Arguments.of(2988,747,4),
				Arguments.of(3740,748,5),
				Arguments.of(1498,749,2),
				Arguments.of(2250,750,3),
				Arguments.of(3004,751,4),
				Arguments.of(3760,752,5),
				Arguments.of(1506,753,2),
				Arguments.of(2262,754,3),
				Arguments.of(3020,755,4),
				Arguments.of(3780,756,5),
				Arguments.of(1514,757,2),
				Arguments.of(2274,758,3),
				Arguments.of(3036,759,4),
				Arguments.of(3800,760,5),
				Arguments.of(1522,761,2),
				Arguments.of(2286,762,3),
				Arguments.of(3052,763,4),
				Arguments.of(3820,764,5),
				Arguments.of(1530,765,2),
				Arguments.of(2298,766,3),
				Arguments.of(3068,767,4),
				Arguments.of(3840,768,5),
				Arguments.of(1538,769,2),
				Arguments.of(2310,770,3),
				Arguments.of(3084,771,4),
				Arguments.of(3860,772,5),
				Arguments.of(1546,773,2),
				Arguments.of(2322,774,3),
				Arguments.of(3100,775,4),
				Arguments.of(3880,776,5),
				Arguments.of(1554,777,2),
				Arguments.of(2334,778,3),
				Arguments.of(3116,779,4),
				Arguments.of(3900,780,5),
				Arguments.of(1562,781,2),
				Arguments.of(2346,782,3),
				Arguments.of(3132,783,4),
				Arguments.of(3920,784,5),
				Arguments.of(1570,785,2),
				Arguments.of(2358,786,3),
				Arguments.of(3148,787,4),
				Arguments.of(3940,788,5),
				Arguments.of(1578,789,2),
				Arguments.of(2370,790,3),
				Arguments.of(3164,791,4),
				Arguments.of(3960,792,5),
				Arguments.of(1586,793,2),
				Arguments.of(2382,794,3),
				Arguments.of(3180,795,4),
				Arguments.of(3980,796,5),
				Arguments.of(1594,797,2),
				Arguments.of(2394,798,3),
				Arguments.of(3196,799,4),
				Arguments.of(4000,800,5),
				Arguments.of(1602,801,2),
				Arguments.of(2406,802,3),
				Arguments.of(3212,803,4),
				Arguments.of(4020,804,5),
				Arguments.of(1610,805,2),
				Arguments.of(2418,806,3),
				Arguments.of(3228,807,4),
				Arguments.of(4040,808,5),
				Arguments.of(1618,809,2),
				Arguments.of(2430,810,3),
				Arguments.of(3244,811,4),
				Arguments.of(4060,812,5),
				Arguments.of(1626,813,2),
				Arguments.of(2442,814,3),
				Arguments.of(3260,815,4),
				Arguments.of(4080,816,5),
				Arguments.of(1634,817,2),
				Arguments.of(2454,818,3),
				Arguments.of(3276,819,4),
				Arguments.of(4100,820,5),
				Arguments.of(1642,821,2),
				Arguments.of(2466,822,3),
				Arguments.of(3292,823,4),
				Arguments.of(4120,824,5),
				Arguments.of(1650,825,2),
				Arguments.of(2478,826,3),
				Arguments.of(3308,827,4),
				Arguments.of(4140,828,5),
				Arguments.of(1658,829,2),
				Arguments.of(2490,830,3),
				Arguments.of(3324,831,4),
				Arguments.of(4160,832,5),
				Arguments.of(1666,833,2),
				Arguments.of(2502,834,3),
				Arguments.of(3340,835,4),
				Arguments.of(4180,836,5),
				Arguments.of(1674,837,2),
				Arguments.of(2514,838,3),
				Arguments.of(3356,839,4),
				Arguments.of(4200,840,5),
				Arguments.of(1682,841,2),
				Arguments.of(2526,842,3),
				Arguments.of(3372,843,4),
				Arguments.of(4220,844,5),
				Arguments.of(1690,845,2),
				Arguments.of(2538,846,3),
				Arguments.of(3388,847,4),
				Arguments.of(4240,848,5),
				Arguments.of(1698,849,2),
				Arguments.of(2550,850,3),
				Arguments.of(3404,851,4),
				Arguments.of(4260,852,5),
				Arguments.of(1706,853,2),
				Arguments.of(2562,854,3),
				Arguments.of(3420,855,4),
				Arguments.of(4280,856,5),
				Arguments.of(1714,857,2),
				Arguments.of(2574,858,3),
				Arguments.of(3436,859,4),
				Arguments.of(4300,860,5),
				Arguments.of(1722,861,2),
				Arguments.of(2586,862,3),
				Arguments.of(3452,863,4),
				Arguments.of(4320,864,5),
				Arguments.of(1730,865,2),
				Arguments.of(2598,866,3),
				Arguments.of(3468,867,4),
				Arguments.of(4340,868,5),
				Arguments.of(1738,869,2),
				Arguments.of(2610,870,3),
				Arguments.of(3484,871,4),
				Arguments.of(4360,872,5),
				Arguments.of(1746,873,2),
				Arguments.of(2622,874,3),
				Arguments.of(3500,875,4),
				Arguments.of(4380,876,5),
				Arguments.of(1754,877,2),
				Arguments.of(2634,878,3),
				Arguments.of(3516,879,4),
				Arguments.of(4400,880,5),
				Arguments.of(1762,881,2),
				Arguments.of(2646,882,3),
				Arguments.of(3532,883,4),
				Arguments.of(4420,884,5),
				Arguments.of(1770,885,2),
				Arguments.of(2658,886,3),
				Arguments.of(3548,887,4),
				Arguments.of(4440,888,5),
				Arguments.of(1778,889,2),
				Arguments.of(2670,890,3),
				Arguments.of(3564,891,4),
				Arguments.of(4460,892,5),
				Arguments.of(1786,893,2),
				Arguments.of(2682,894,3),
				Arguments.of(3580,895,4),
				Arguments.of(4480,896,5),
				Arguments.of(1794,897,2),
				Arguments.of(2694,898,3),
				Arguments.of(3596,899,4),
				Arguments.of(4500,900,5),
				Arguments.of(1802,901,2),
				Arguments.of(2706,902,3),
				Arguments.of(3612,903,4),
				Arguments.of(4520,904,5),
				Arguments.of(1810,905,2),
				Arguments.of(2718,906,3),
				Arguments.of(3628,907,4),
				Arguments.of(4540,908,5),
				Arguments.of(1818,909,2),
				Arguments.of(2730,910,3),
				Arguments.of(3644,911,4),
				Arguments.of(4560,912,5),
				Arguments.of(1826,913,2),
				Arguments.of(2742,914,3),
				Arguments.of(3660,915,4),
				Arguments.of(4580,916,5),
				Arguments.of(1834,917,2),
				Arguments.of(2754,918,3),
				Arguments.of(3676,919,4),
				Arguments.of(4600,920,5),
				Arguments.of(1842,921,2),
				Arguments.of(2766,922,3),
				Arguments.of(3692,923,4),
				Arguments.of(4620,924,5),
				Arguments.of(1850,925,2),
				Arguments.of(2778,926,3),
				Arguments.of(3708,927,4),
				Arguments.of(4640,928,5),
				Arguments.of(1858,929,2),
				Arguments.of(2790,930,3),
				Arguments.of(3724,931,4),
				Arguments.of(4660,932,5),
				Arguments.of(1866,933,2),
				Arguments.of(2802,934,3),
				Arguments.of(3740,935,4),
				Arguments.of(4680,936,5),
				Arguments.of(1874,937,2),
				Arguments.of(2814,938,3),
				Arguments.of(3756,939,4),
				Arguments.of(4700,940,5),
				Arguments.of(1882,941,2),
				Arguments.of(2826,942,3),
				Arguments.of(3772,943,4),
				Arguments.of(4720,944,5),
				Arguments.of(1890,945,2),
				Arguments.of(2838,946,3),
				Arguments.of(3788,947,4),
				Arguments.of(4740,948,5),
				Arguments.of(1898,949,2),
				Arguments.of(2850,950,3),
				Arguments.of(3804,951,4),
				Arguments.of(4760,952,5),
				Arguments.of(1906,953,2),
				Arguments.of(2862,954,3),
				Arguments.of(3820,955,4),
				Arguments.of(4780,956,5),
				Arguments.of(1914,957,2),
				Arguments.of(2874,958,3),
				Arguments.of(3836,959,4),
				Arguments.of(4800,960,5),
				Arguments.of(1922,961,2),
				Arguments.of(2886,962,3),
				Arguments.of(3852,963,4),
				Arguments.of(4820,964,5),
				Arguments.of(1930,965,2),
				Arguments.of(2898,966,3),
				Arguments.of(3868,967,4),
				Arguments.of(4840,968,5),
				Arguments.of(1938,969,2),
				Arguments.of(2910,970,3),
				Arguments.of(3884,971,4),
				Arguments.of(4860,972,5),
				Arguments.of(1946,973,2),
				Arguments.of(2922,974,3),
				Arguments.of(3900,975,4),
				Arguments.of(4880,976,5),
				Arguments.of(1954,977,2),
				Arguments.of(2934,978,3),
				Arguments.of(3916,979,4),
				Arguments.of(4900,980,5),
				Arguments.of(1962,981,2),
				Arguments.of(2946,982,3),
				Arguments.of(3932,983,4),
				Arguments.of(4920,984,5),
				Arguments.of(1970,985,2),
				Arguments.of(2958,986,3),
				Arguments.of(3948,987,4),
				Arguments.of(4940,988,5),
				Arguments.of(1978,989,2),
				Arguments.of(2970,990,3),
				Arguments.of(3964,991,4),
				Arguments.of(4960,992,5),
				Arguments.of(1986,993,2),
				Arguments.of(2982,994,3),
				Arguments.of(3980,995,4),
				Arguments.of(4980,996,5),
				Arguments.of(1994,997,2),
				Arguments.of(2994,998,3),
				Arguments.of(3996,999,4),
				Arguments.of(5000,1000,5)
				);
	}

}