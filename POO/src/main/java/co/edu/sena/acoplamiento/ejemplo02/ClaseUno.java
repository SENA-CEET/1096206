package co.edu.sena.acoplamiento.ejemplo02;

public class ClaseUno {

    public InterfaceClaseDos getClaseDos(){
        return new ClaseDos();
    }

    private class ClaseDos implements InterfaceClaseDos{

        public InterfaceClaseTres getClaseTres(){
            return new ClaseTres();
        }


        private class ClaseTres implements InterfaceClaseTres{

            public InterfaceClaseCuatro getClaseCuatro(){
                return new ClaseCuatro();
            }

            private class ClaseCuatro implements InterfaceClaseCuatro{

            }
        }
    }
}
