import  java.util.Scanner;
public class evc11 {
    public static void main(String[] args) {
        // EVC PLUS PROGRAM
        Scanner scan = new Scanner(System.in);
        int haraga = 2000;
        int passwoard = 1118;
        System.out.println("fadlan geli pinkaaga:");
        int pinpaswrd = scan.nextInt();
        if (passwoard == pinpaswrd) {
            System.out.println("Ku soo dhawaw Evc plus:");
            System.out.println("1 Itus haragaga:");
            System.out.println("2 Kaarka Hadalka:");
            System.out.println("3 Bixi Biil:");
            System.out.println("4 U wareej Evc plus:");
            System.out.println("5 Warbxn Kooban:");
            System.out.println("6 Salam bank:");
            System.out.println("7 Maareynta:");
            System.out.println("8 Bll payment:");

            System.out.println("Fadlan Dooro Howsha aad rabtd naa fuliso:");
            int user = scan.nextInt();
            ////Doorashad menuga
            switch (user) {
                case 1:
                    ////Itus haraga
                    System.out.println("Haraagagu waa " + haraga);
                    break;
                case 2:
                    ///Kaarka Hadalka
                    System.out.println("Kaarka Hadalka:");
                    System.out.println("1 Ku shubo airtime: ");
                    System.out.println("2 Ugu shub airtime: ");
                    System.out.println("3 MIFI PACKAGES: ");
                    System.out.println("4 Ku shubo internet: ");
                    System.out.println("5 Ugu shub qofkale (MMT) :");
                    ////Doorasho

                    int dooro = scan.nextInt();
                    ///Ku subo artime
                    if (dooro == 1) {
                        System.out.println("Fadlan geli lacagta:");
                        int lacag = scan.nextInt();
                        int result = haraga - lacag;
                        System.out.println("Ma hubtaa inaad ku shubatid: " + lacag);
                        System.out.println("1 Haa:");
                        System.out.println("2 Maya:");
                        int aqbal = scan.nextInt();
                        if (aqbal == 1) {
                            if (lacag < haraga) {
                                System.out.println("Waxaad ku shubatay airtime garaayo " + lacag + "Haraagagu waa " + result);
                            } else {
                                System.out.println("Waa ka xunahay Haraga xisaabtada kuguma filna lacagta lagu shubi rabo waa " + lacag + "Haraagagana waa " + haraga);
                            }
                        } else {
                            System.out.println("Mahdsanid:");
                        }
                    }
                    ////Ugu shub airtime
                    else if (dooro == 2) {
                        System.out.println("Fadlan Gel lambarka:");
                        int lambar = scan.nextInt();
                        System.out.println("Fadlan gel lacagta:");
                        int lacag2 = scan.nextInt();
                        int result2 = haraga - lacag2;
                        System.out.println("Ma Hubtaa inaad " + lacag2 + "$ ugu shubto: " + lambar);
                        System.out.println("1 Haa:");
                        System.out.println("2 Maya:");
                        int user2 = scan.nextInt();
                        if (user2 == 1) {
                            if (lacag2 < haraga) {
                                System.out.println("Waxaad " + lacag2 + "$ Ugu shubtay " + lambar + "Haragagu waa " + result2);
                            } else {
                                System.out.println("Waa ka xunahay Haraga xisaabtada kuguma filna lacagta lagu shubi rabo waa " + lacag2 + "Haraagagana waa " + haraga);

                            }
                        } else {
                            System.out.println("Mahdsand:");
                        }
                    }
                    ////MIFI PACKAGE
                    else if (dooro == 3) {
                        System.out.println("Evc plus:");
                        System.out.println("Ku shubo data da Wifi:");
                        int data = scan.nextInt();
                        if (data == 1) {
                            System.out.println("--internet bundle recharge:");
                            System.out.println("1 Isbuucle (weekly:)");
                            System.out.println("Maalinle (daily):");
                            System.out.println("Bile (Monthly):");
                            int data2 = scan.nextInt();
                            if (data2 == 1) {
                                System.out.println("Fadlan dooro bundle ka: ");
                                System.out.println("1 $5 =10GB:");
                                System.out.println(" $10=25 GB:");
                                int data3 = scan.nextInt();
                                if (data3 == 1) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    System.out.println("Invalid Wifi user: ");
                                } else if (data3 == 2) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                }
                                ////Daily
                            } else if (data2 == 2) {
                                System.out.println("Fadlan dooro bundleka:");
                                System.out.println("1 $1= 2GB:");
                                System.out.println("2 $2=5 GB:");
                                int day = scan.nextInt();
                                if (day == 1) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                } else if (day == 2) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                }
                                ////Bille
                            } else if (data2 == 3) {
                                System.out.println("Fadlan dooro bundleka: ");
                                System.out.println("1 $20= 40GB:");
                                System.out.println("2 $40=86 GB:");
                                System.out.println("3 $60=150 GB:");
                                System.out.println("4 $30=");
                                System.out.println("Monthly unimit:");
                                int month = scan.nextInt();
                                if (month == 1) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                } else if (month == 2) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                } else if (month == 3) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                } else if (month == 4) {
                                    System.out.println("Fadlan geli user Wifi ga:");
                                    int mifi = scan.nextInt();
                                    System.out.println("Invalid Wifi user: ");
                                }
                            }
                        }
                        /////Ku shubo nternet
                    } else if (dooro == 4) {
                        System.out.println("Fadlan geli lacagta:");
                        int internet = scan.nextInt();
                        System.out.println("Ma hubtaa naad " + internet + "Ugu shubtid undefined?");
                        System.out.println("Haa:");
                        System.out.println("Maya:");
                        int haa = scan.nextInt();
                        if (haa == 1) {
                            int result = haraga - internet;
                            if (result > haraga) {
                                System.out.println("Waa ka xunahay laguma shubi karo lacagtaas haragaga waa " + haraga);

                            } else {
                                System.out.println("Waxaad ku shubata  " + internet + "Haragagu waa " + result);
                            }
                        } else {
                            System.out.println("Mahadsanid:");
                        }
                    }////Ugu shub qofkale
                    else if (dooro == 5) {
                        System.out.println("Fadlan geli mobile k:a");
                        int number2 = scan.nextInt();
                        System.out.println("Fadlan geli lacagta:");
                        int lacag3 = scan.nextInt();
                        System.out.println("Ma hubtaa inaad " + lacag3 + "Ugu shubtid " + number2);
                        System.out.println("1 Haa:");
                        System.out.println("2 Maya:");
                        int maya = scan.nextInt();
                        if (maya == 1) {
                            int jar = haraga - lacag3;
                            if (jar > haraga) {
                                System.out.println("Waa ka xunahya laguma shubi karo lacagtaas ");
                            } else {
                                System.out.println("Waxaad ugu shubtay " + lacag3 + " " + number2 + "Haraagagu waa " + jar);
                            }
                        } else {
                            System.out.println("Mhadsnaid:");
                        }
                    }
                    break;
                case 3:
                    ////Bixi Biil
                    System.out.println("Bixi Biil:");
                    System.out.println("1 Post paid:");
                    System.out.println("2 Ku iibso:");
                    int bixi = scan.nextInt();
                    if (bixi == 1) {
                        System.out.println("Post paid:");
                        System.out.println("1 Ogow Biilka:");
                        System.out.println("2 Bix Biil:");
                        System.out.println("3 Ka bixi biil:");
                        int bil = scan.nextInt();
                        if (bil == 1) {
                            System.out.println("An eror occured please try again:");
                        } else if (bil == 2) {
                            System.out.println("An eror occured please try again:");
                        } else if (bil == 3) {
                            System.out.println("An eror occured please try again:");
                        }
                    } else if (bixi == 2) {
                        System.out.println("Fadlan geli aqoonsga ganacsadah:");
                        int ganacsade = scan.nextInt();
                        System.out.println("An eror occured please try again:");
                    }
                    break;
                case 4:
                    ////U wareej Evc plus
                    System.out.println("Fadlan geli mobile ka:");
                    int wareejin = scan.nextInt();
                    System.out.println("Fadlan Geli lacagta:");
                    int lacag4 = scan.nextInt();
                    System.out.println("Ma hubtaa inaad  " + lacag4 + "$  u wareejsid " + wareejin + "?");
                    System.out.println("1 Haa:");
                    System.out.println("2 Maya;");
                    int haa2 = scan.nextInt();
                    if (haa2 == 1) {
                        int result4 = haraga - lacag4;
                        if (lacag4 < haraga) {
                            System.out.println("<Evcplus> waxaad " + lacag4 + "$ U wareejisay " + wareejin + " Haraagagu waa  " + result4);

                        } else {
                            System.out.println("Waa ka xunahay haragaga xisaabtada kuguma filna");
                        }
                    }
                    break;
                case 5:
                    //// Warbxn Kooban
                    System.out.println("Warbxin kooban:");
                    System.out.println("1 Lat action:");
                    System.out.println("2 Wareejntii u dambeysay:");
                    System.out.println("3 Iiibsashad u dambeysay:");
                    System.out.println("4 Last 3 actions:");
                    System.out.println("4 Email me my actiity:");
                    int action = scan.nextInt();
                    if (action == 1) {

                        System.out.println("<Evcplus> waxaad 100$" + "$ U wareejisay 615111837 Haraaggu waa 200$ ");
                    } else if (action == 2) {
                        System.out.println("Statementiga :");

                        System.out.println("1 U dirtay:");
                        System.out.println("2 Ka aheshay:");
                        int last2 = scan.nextInt();
                        if (last2 == 1) {

                            System.out.println("<Evcplus> waxaad 100$ " + " U dirtay 617518082 Haraagagu waa 200$ ");
                        } else if (last2 == 2) {
                            System.out.println("Fadlan soo geli mobile ka:");
                            int mobile = scan.nextInt();
                            System.out.println("<Evcplus> waxaad " + haraga + "$ Ka heshay " + mobile + " Haraagagu waa  " + haraga);
                        }
                    } else if (action == 3) {
                        System.out.println("Fadlan geli aqoonsiga ganacsadaha:");
                        int ganacsade = scan.nextInt();
                        System.out.println("An eror occured please try agin:");
                    } else if (action == 4) {
                        System.out.println("Your mni statement has been sent as sms to your registered  mobile no:");

                    } else if (action == 5) {
                        System.out.println("Fadlan gel emalkaga:");
                        System.out.println("Invalid  input format (datatype):");
                    }

                    ///2
                    break;
                case 6:
                    ////Salam bank
                    System.out.println("Salaam bank:");
                    System.out.println("1 Ka wareeji Evc plus:");
                    int bank = scan.nextInt();
                    System.out.println("Fadlan Dooro xisaabta bangiga:");
                    System.out.println("1 Salaam bank:");
                    System.out.println("2 Daarasalam Bank:");
                    System.out.println("3 Bank Beeraha:");
                    System.out.println("4 Salaam sch:");
                    int salam = scan.nextInt();
                    if (salam == 1) {
                        System.out.println("Fadlan geli acount gaga:");
                        int account = scan.nextInt();
                        System.out.println("An eror occured please try again:");

                    } else if (salam == 2) {
                        System.out.println("Fadlan geli acount gaga:");
                        int account = scan.nextInt();
                        System.out.println("An eror occured please try again:");

                    } else if (salam == 3) {
                        System.out.println("Fadlan geli acount gaga:");
                        int account = scan.nextInt();
                        System.out.println("An eror occured please try again:");

                    } else if (salam == 4) {
                        System.out.println("Fadlan geli acount gaga:");
                        int account = scan.nextInt();
                        System.out.println("An eror occured please try again:");
                    }
                    break;
                case 7:
                    ////Maareynta
                    System.out.println("Maareynta:");
                    System.out.println("1 Bedel lambarka sirta ah:");
                    System.out.println("2 Bedel Luqada:");
                    System.out.println("3 Wargeln moble lumay:");
                    System.out.println("4 Lacag xirasho:");
                    System.out.println("5 U celi lacag qaldantay:");
                    int mareyn = scan.nextInt();
                    if (mareyn == 1) {
                        System.out.println("Fadlan Geli pinkaga cusub:");
                        int pin = scan.nextInt();
                        System.out.println("Pinkaaga waa la bedelay  pinkaga cusub waa " + pin);

                    } else if (mareyn == 2) {
                        System.out.println("1 Somali:");
                        System.out.println("2 Englsh:");
                        System.out.println("3 Arabic:");
                        int luqad = scan.nextInt();
                        if (luqad == 1) {
                            System.out.println("Luqadadii waa labedelay waxana loo badalay af somali:");
                        } else if (luqad == 2) {
                            System.out.println("You are changed your language an dyour language is English :");
                        } else if (luqad == 3) {
                            System.out.println("Naxnu nubadal luqata haatuf:");
                        }
                    } else if (mareyn == 3) {
                        System.out.println("Fadlan gel mobleka lumay :");
                        int lumay = scan.nextInt();
                        System.out.println("Fadlan geli lambarkiisa sirta ah: ");
                        int sir = scan.nextInt();
                        System.out.println("Waxaa loo diiwangleiyay " + lumay + "Inuu dhumay Fadlan tag xaruta kugu dhaw ee shrkada mahadsanid");

                    } else if (mareyn == 4) {
                        System.out.println("Fadlan Gel lambarka khaladka ah:");
                        int qalad = scan.nextInt();
                        System.out.println("Fadlan gelilambarkii loo rabay:");
                        int rabid = scan.nextInt();
                        System.out.println("Fadlan Geli macluumaad:");
                        int macluumad = scan.nextInt();
                        System.out.println("Waa laxiray " + qalad + "Fadlan tag xarunta kugu dhaw shirkada hadii wax jawaab ah heli weysid mahadsanid");
                    } else if (mareyn == 5) {
                        System.out.println("Fadlan geli aqoonsiga lacag dirida:");
                        int dirid2 = scan.nextInt();
                        System.out.println("S sax ah u ma aad gelin aqoonsga fadlan booqo xarunta kugu dhaw ee shirkada mahadsanid");
                    }
                    break;
                case 8:
                    ////Bll payment
                    System.out.println("Evc plus:");
                    System.out.println("1 Itus haragaga biilka:");
                    System.out.println("2 Wada bixi Biilka:");
                    System.out.println("3 Qeybta bxi biilka:");
                    int biilka = scan.nextInt();
                    if (biilka == 1) {
                        System.out.println("Fadlan geli biil referance numberka:");
                        int referance = scan.nextInt();
                        System.out.println("Some parametres are missiing please check your request:");
                    } else if (biilka == 2) {
                        System.out.println("Fadlan geli biil referance numberka:");
                        int referance = scan.nextInt();
                        System.out.println("Some parametres are missiing please check your request:");
                    } else if (biilka == 3) {
                        System.out.println("Fadlan geli biil referance numberka:");
                        int referance = scan.nextInt();
                    }
                    break;
                default:
                    System.out.println("Waa ka xunahay Fadlan si sax ah u isticmaal applicationka mahadsand:");
            }
        }
        else
            System.out.println("pinkaagu waa khalad:");
    }
}