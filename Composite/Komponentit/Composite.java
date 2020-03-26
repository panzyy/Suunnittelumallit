/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponentit;
import java.util.List;
/**
 *
 * @author panzyy
 */
public interface Composite extends Component {
    
    public boolean addComponent(Component c);
    public boolean removeComponent(Component c);
    public int ComponentCount();
    public List<Component> getComponents();
}
