class Badge {
    public String print(Integer id, String name, String department) {
        var credencial = "";
        if(id != null){
            credencial = credencial +"["+id+"] - "+ name;
        } else {
            credencial = credencial + name;
        }
        if(department != null){
            credencial = credencial +" - "+ department.toUpperCase();
        } else {
            credencial = credencial + " - OWNER";
        }
        return credencial;
    }
}
