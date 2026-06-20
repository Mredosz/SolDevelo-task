# 1. AI Tools Used

I used ChatGPT during the implementation of this task.

# 2. One AI Interaction That Helped Me

During the second stage, I was not sure how to implement the solution in a clean way without creating a special case for numbers divisible by both 3 and 5, so I asked ChatGPT for help.

**My question:**

```java
private static void alertFunction(List<Integer> list) {

    for (var num : list){

        var output = "";

        if (num % 3 == 0){

            output += "LOW";

        } else if (num % 5 == 0) {

            output += "ADVISORY";

        } else {

            output = num.toString();

        }

        System.out.println(output);

    }

}
```

How can I fix it so that when a number is divisible by both 3 and 5, it prints `LOWADVISORY`?

**AI response:**

```java
private static void alertFunction(List<Integer> list) {

    for (var num : list) {

        var output = "";

        if (num % 3 == 0) {
            output += "LOW";
        }

        if (num % 5 == 0) {
            output += "ADVISORY";
        }

        if (output.isEmpty()) {
            output = num.toString();
        }

        System.out.println(output);
    }
}
```

**What I used and why it was helpful:**

The suggestion helped me understand that I should use two independent conditions instead of an `if-else` chain. This allowed multiple rules to match the same number and produce a combined result such as `LOWADVISORY`.

# 3. One Suggestion I Modified

SonarQube suggested replacing string concatenation (`+=`) with `StringBuilder` in the `AlertEngine` class.

I accepted this suggestion because `StringBuilder` is a more efficient way to build strings when multiple values may be appended. The final implementation uses `StringBuilder` instead of repeated string concatenation.
