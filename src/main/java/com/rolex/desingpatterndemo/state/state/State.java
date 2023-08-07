package com.rolex.desingpatterndemo.state.state;

import com.rolex.desingpatterndemo.state.context.Context;

public interface State {
    public void doAction(Context context);
}
