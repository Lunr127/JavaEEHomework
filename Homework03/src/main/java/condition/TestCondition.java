package condition;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class TestCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        String[] beanNamesForType = beanFactory.getBeanNamesForType(Test1.class);
        return ArrayUtils.isNotEmpty(beanNamesForType);
    }
}
