  String s = "followthecode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

                // first time it becomes 2 → return result
                if (map.get(c) == 2) {
                    System.out.println("First repeating character: " + c);
                    return;
                }

            } else {
                map.put(c, 1);
            }
        }

        System.out.println("No repeating character found");
    }
}