            if(Character.isLowerCase(ch)){
                lower |=(1<<(ch-'a'));
            }
            else{
                upper |= (1<<(ch-'A'));
            }
        }
        int common=lower&upper;
        return Integer.bitCount(common);    }
}