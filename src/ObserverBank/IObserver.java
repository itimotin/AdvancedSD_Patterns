package ObserverBank;

import ObserverBank.domain.Subject;

public interface IObserver {
    public void update(Object o);
    
    public void setSubject(Subject subj);
}
