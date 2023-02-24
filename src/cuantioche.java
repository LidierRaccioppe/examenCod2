public class cuantioche {
        private static Float result= null; //esperemos que fuicione

        /**
         * Calculadora menos que basica
         * @param num1 el primer numero
         * @param num2 eñ segundo numero
         * @param option la palanca para elejir el case
         * @return float en caso correcto
         */
        public static float calculameEsta (float num1, float num2, String option){
                final String MULTIPLICAR= "multiplicar";
                final String DIVIDIR= "dividir";
                final String SUMAR= "sumar";
                final String RESTAR= "restar";
                switch (option){
                        case MULTIPLICAR:
                                try{
                                        result=num1*num2;
                                }catch (Exception e){
                                        System.out.println("Horror");
                                }
                                break;
                        case DIVIDIR:
                                try{
                                        result=num1/num2;
                                }catch (Exception e){
                                        System.out.println("Horror");
                                }
                                break;
                        case SUMAR:
                                try{
                                        result=num1+num2;
                                }catch (Exception e){
                                        System.out.println("Horror");
                                }
                                break;
                        case RESTAR:
                                try{
                                        result=num1-num2;
                                }catch (Exception e){
                                        System.out.println("Horror");
                                }
                                break;
                        default:
                                System.out.println("opcion incorrecta");
                }
                return result;
        }
        {}
}