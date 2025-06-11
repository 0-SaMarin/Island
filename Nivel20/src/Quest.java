public class Quest {
    public static void main(String[] args) {
        CodeGymQuest.CodeGym[] codeGym = CodeGymQuest.CodeGym.values();
        for(CodeGymQuest.CodeGym cont : codeGym){
            System.out.println(cont.ordinal());
        }
    }

    class CodeGymQuest {
        public enum CodeGym {
            JAVA_SINTAX,
            JAVA_CORE,
            JAVA_MULTITHREADING,
            JAVA_COLLECTIONS
        }
    }
}
