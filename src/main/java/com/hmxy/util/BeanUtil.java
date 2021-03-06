package com.hmxy.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 实体转MAP
 * @author  laingjie
 */
public class BeanUtil
{
    public static Map<String, Object> beanToMap(Object bean)
            throws IntrospectionException, IllegalAccessException, InvocationTargetException
    {
        Class<? extends Object> type = bean.getClass();
        Map<String, Object> returnMap = new HashMap();
        BeanInfo beanInfo = Introspector.getBeanInfo(type);

        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < propertyDescriptors.length; i++)
        {
            PropertyDescriptor descriptor = propertyDescriptors[i];
            String propertyName = descriptor.getName();
            if (!propertyName.equals("class"))
            {
                Method readMethod = descriptor.getReadMethod();
                Object result = readMethod.invoke(bean, new Object[0]);
                if (result != null) {
                    returnMap.put(propertyName, result);
                } else if("java.util.Date".equals(descriptor.getPropertyType().getName())){
                    returnMap.put(propertyName, null);
                }else {
                    returnMap.put(propertyName, "");
                }
            }
        }
        return returnMap;
    }
}
