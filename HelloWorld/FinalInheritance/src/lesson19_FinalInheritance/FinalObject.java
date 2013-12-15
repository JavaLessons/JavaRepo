package lesson19_FinalInheritance;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 14.11.13
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
//Ключевое слово final при опредлении класса запрещает наследоваться от этого класса. Этот класс всегда является листовым в иерархии классов.
//Приминение, как механизм защиты от инъекций кода в проект. Внутренний механизм JVM используемый для системных классов, наследование от которых могло бы изменить логику работы стандартных классов JVM
final public class FinalObject extends BaseObject {
}
