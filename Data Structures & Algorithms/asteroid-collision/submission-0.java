class Solution {
       public int[] asteroidCollision(int[] asteroids) {

            Stack<Integer> stack = new Stack<>();

            for (int ast : asteroids) {

                if (stack.isEmpty() || ast > 0) {
                    stack.push(ast);
                    continue;
                }

                while (!stack.isEmpty() && stack.peek() > 0) {

                    int top = stack.peek();

                    if (top == -ast) {
                        stack.pop();
                        ast = 0;
                        break;
                    } else if (top < -ast) {
                        stack.pop();
                    } else {
                        ast = 0;
                        break;
                    }
                }

                if (ast != 0) {
                    stack.push(ast);
                }
            }

            int[] arr = new int[stack.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = stack.get(i);
            }

            return arr;
        }
}