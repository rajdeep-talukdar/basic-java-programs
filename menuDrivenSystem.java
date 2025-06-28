//import java.util.Scanner;
//
//public class menuDrivenSystem {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter 1 for phone, 2 for laptop, 3 for tablet, 4 for accessories: ");
//        int proID = in.nextInt();
//        switch (proID) {
//            case 1 -> {
//                System.out.println("you've selected phone, please choose a brand!");
//                System.out.print("enter 1 for apple, 2 for samsung, 3 for oneplus: ");
//                int brandID = in.nextInt();
//                switch (brandID) {
//                    case 1 -> {
//                        String brand = "apple";
//                        System.out.println("great, you've selected " + brand + "!\nthese are the available models:");
//                        System.out.println("1. 16 pro\n2. 16\n3. 15 pro\n4. 15 plus");
//                        System.out.print("please choose any model: ");
//                        int modelID = in.nextInt();
//                        switch (modelID) {
//                            case 1-> {
//                                String model = "16 pro";
//                                System.out.println("you have selected " + model + "!");
//                                System.out.println("now please choose the color to proceed!");
//                                System.out.println("1. desert titanium\n2. natural titanium\n3. white titanium\n4. black titanium");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "desert titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "natural titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "white titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 4 -> {
//                                        String color = "black titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 2-> {
//                                String model = "16";
//                                System.out.println("you have selected " + model + "!");
//                                System.out.println("now please choose the color to proceed!");
//                                System.out.println("1. black\n2. white\n3. teal\n4. ultramarine");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "black";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "white";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "teal";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 4 -> {
//                                        String color = "ultramarine";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//
//                            }
//                            case 3-> {
//                                String model = "15 pro";
//                                System.out.println("1. natural titanium\n2. white titanium\n3. blue titanium\n4. black titanium");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "natural titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "white titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "blue titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 4 -> {
//                                        String color = "black titanium";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 4-> {
//                                String model = "15 plus";
//                                System.out.println("1. black\n2. blue\n3. green");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "black";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "blue";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "green";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            default -> System.out.println("error! enter a valid ID for models");
//                        }
//                    }
//                    case 2 -> {
//                        String brand = "samsung";
//                        System.out.println("great, you've selected " + brand + "!\nthese are the available models:");
//                        System.out.println("1. s25 ultra\n2. s25 edge\n3. s24 ultra\n4. s24");
//                        System.out.print("please choose any model: ");
//                        int modelID = in.nextInt();
//                        switch (modelID) {
//                            case 1-> {
//                                String model = "s25 ultra";
//                                System.out.println("you have selected " + model + "!");
//                                System.out.println("now please choose the color to proceed!");
//                                System.out.println("1. titanium silverblue\n2. titanium grey\n3. titanium black\n4. titanium whitesilver");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "titanium silverblue";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "titanium grey";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "titanium black";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 4 -> {
//                                        String color = "titanium whitesilver";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 2-> {
//                                String model = "s25 edge";
//                                System.out.println("you have selected " + model + "!");
//                                System.out.println("now please choose the color to proceed!");
//                                System.out.println("1. titanium silver\n2. titanium jetblack\n3. titanium icyblue");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "titanium silver";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "titanium jetblack";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "titanium icy blue";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//
//                                    default -> System.out.println("error color id");
//                                }
//
//                            }
//                            case 3-> {
//                                String model = "s24 ultra";
//                                System.out.println("1. titanium black\n2. titanium grey\n3. titanium violet\n4. titanium yellow");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "titanium black";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "titanium grey";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "titanium violet";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 4 -> {
//                                        String color = "titanium yellow";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 4-> {
//                                String model = "s24";
//                                System.out.println("1. marble grey\n2. onyx black\n3. cobalt violet\n4. amber yellow");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "marble grey";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "onyx black";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "cobalt violet";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 4 -> {
//                                        String color = "amber yellow";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            default -> System.out.println("error! enter a valid ID for models");
//                        }
//                    }
//                    case 3 -> {
//                        String brand = "oneplus";
//                        System.out.println("great, you've selected " + brand + "!\nthese are the available models:");
//                        System.out.println("1. 13\n2. 13s\n3. 12r\n4. 12");
//                        System.out.print("please choose any model: ");
//                        int modelID = in.nextInt();
//                        switch (modelID) {
//                            case 1-> {
//                                String model = "13";
//                                System.out.println("1. midnight ocean\n2. black eclipse\n3. arctic dawn");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "midnight ocean";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb\n3. 1tb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "black eclipse";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "arctic dawn";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb\n3. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 3 -> {
//                                                String storage = "1tb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 2-> {
//                                String model = "13s";
//                                System.out.println("1. green silk\n2. black velvet");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "green silk";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "black velvet";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 3-> {
//                                String model = "12r";
//                                System.out.println("1. iron gray\n2. cool blue");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "iron gray";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "cool blue";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "128gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                            case 4-> {
//                                String model = "12";
//                                System.out.println("1. silky black\n2. flowy emerald\n3. glacial white");
//                                System.out.print("choose any color: ");
//                                int colorID = in.nextInt();
//                                switch (colorID) {
//                                    case 1 -> {
//                                        String color = "silky black";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 256gb\n2. 512gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 2 -> {
//                                        String color = "flowy emerald";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    case 3 -> {
//                                        String color = "glacial white";
//                                        System.out.println("you have selected, " + color + "!");
//                                        System.out.println("please choose storage :\n1. 128gb\n2. 256gb");
//                                        System.out.print("choose any one to proceeed: ");
//                                        int storID = in.nextInt();
//                                        switch (storID) {
//                                            case 1-> {
//                                                String storage = "256gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//                                            case 2 -> {
//                                                String storage = "512gb";
//                                                System.out.println("you've selected storage " + storage);
//                                            }
//
//                                            default -> System.out.println("error storage id");
//                                        }
//                                    }
//                                    default -> System.out.println("error color id");
//                                }
//                            }
//                        }
//                    }
//                    default -> System.out.println("error! enter a valid ID for brands");
//                }
//            }
//
//            case 2 -> {
//                System.out.println("you've selected laptop, please choose a brand! ");
//                System.out.print("enter 1 for apple, 2 for asus, 3 for dell: ");
//                int lpBrand = in.nextInt();
//                switch (lpBrand) {
//                    case 1 -> {
//                        System.out.println("you've selected 'apple'");
//                    }
//                    case 2 -> System.out.println("you've selected 'asus'");
//                    case 3 -> System.out.println("you've selected 'dell'");
//                    default -> System.out.println("error! enter a valid ID for brands");
//                }
//            }
//
//            case 3 -> {
//                System.out.println("you've selected tablet, please choose a brand! ");
//                System.out.print("enter 1 for apple, 2 for samsung, 3 for xiaomi: ");
//                int tbBrand = in.nextInt();
//                switch (tbBrand) {
//                    case 1 -> System.out.println("you've selected 'apple'");
//                    case 2 -> System.out.println("you've selected 'samsung'");
//                    case 3 -> System.out.println("you've selected 'xiaomi'");
//                    default -> System.out.println("error! enter a valid ID for brands");
//                }
//            }
//
//            case 4 -> {
//                System.out.println("you've selected accessories, please select the item you want!");
//                System.out.print("enter 1 for chargers, 2 for audio products, 3 for laptop accessories: ");
//                int accItem = in.nextInt();
//                switch (accItem) {
//                    case 1 -> System.out.println("you've selected 'chargers'");
//                    case 2 -> System.out.println("you've selected 'audio products'");
//                    case 3 -> System.out.println("you've selected 'laptop accessories'");
//                    default -> System.out.println("error! enter a valid ID for brands");
//                }
//            }
//
//            default -> System.out.println("error! enter a valid product ID");
//        }
//    }
//}




//this is the basic program i have made give me what else more can be added here and also one doubt how do i save
// the item user selected and at last prompt the message you have selected this item this model, and also i want
// to add a last payment option, it will display the payment and ask user to enter the amount displayed and if the
// number matches the amount displayed, print payment successful and if the amount entered is less print amount
// is less and again prompt the user to enter remaining money or cancel the purchase option displayed and if the
// user enters more money print the remaining money returned to the user and also there should be an option to add
// to cart, and proceed to payment where this all happens, now don't generate any code i will write it on my own i
// just want you to tell me the logics and hints

