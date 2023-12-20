class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder s=new StringBuilder();
        for(char c:dnaStrand.toCharArray()){
            if(c=='G')
                s.append('C');
            else if (c=='C')
                s.append('G');
            else if (c=='T') {
                s.append('A');
            } else if (c=='A') {
                s.append('U');
            }

        }

return String.valueOf(s);
    }

}
