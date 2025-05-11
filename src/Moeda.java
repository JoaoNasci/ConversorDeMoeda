public record Moeda(String base_code,String target_code, String conversion_result) {

    @Override
    public String toString() {
        return "Convertendo "+ this.base_code()+" para "+ this.target_code() +", valor final: "+conversion_result;
    }
}
