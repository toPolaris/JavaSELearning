package PermissionModifier;

/*
 * Java中有四个权限修饰符：public > protected > (default) > private
 *       同一个类            √       √           √           √
 *       同一个包            √       √           √           ×
 *       存在于不同包的子类    √       √           ×           ×
 *       不同包非子类         √       ×           ×           ×
 *   (default)表示不写明权限修饰符
 * */
public class PermissionModifier {
}
