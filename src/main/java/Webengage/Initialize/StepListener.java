package Webengage.Initialize;
import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.*;

public class StepListener  extends Initialize implements EventListener {

    private static String currentStepText = "";

    public static String getCurrentStepText() {
        return currentStepText;
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestStepFinished.class, this::handleStepFinished);
    }

    private void handleStepFinished(TestStepFinished event) {
        if (event.getResult().getStatus() == Status.FAILED && event.getTestStep() instanceof PickleStepTestStep) {
            PickleStepTestStep step = (PickleStepTestStep) event.getTestStep();
            currentStepText = step.getStep().getText();
        }
    }
}
