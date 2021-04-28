package HomeWork12;

public class Worker {

    private OnTaskDoneListener callbackDone;
    private OnTaskErrorListener callbackError;

    public Worker(OnTaskDoneListener callbackDone, OnTaskErrorListener callbackError) {
        this.callbackDone = callbackDone;
        this.callbackError = callbackError;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                callbackError.onError("Task " + i + " is error");
            }
            callbackDone.onDone("Task " + i + " is done");

        }
    }
}
