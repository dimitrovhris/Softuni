package associativeArraysEx;

import java.util.*;

public class Ex08CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, List<String>> companyData = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            input = sc.nextLine();
            if (!companyData.containsKey(company)) {
                companyData.put(company, new ArrayList<>());
            }
            if (!companyData.get(company).contains(id)) {
                companyData.get(company).add(id);
            }
        }
        for (Map.Entry<String, List<String>> entry : companyData.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String employeeId : entry.getValue()){
                System.out.printf("-- %s%n", employeeId);
            }
        }

    }
}
