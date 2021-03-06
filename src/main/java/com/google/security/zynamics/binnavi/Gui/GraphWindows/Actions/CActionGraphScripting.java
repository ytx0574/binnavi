/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.GraphWindows.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.security.zynamics.binnavi.Gui.GraphWindows.CGraphPanel;


/**
 * Action used to show a graph scripting dialog.
 */
public final class CActionGraphScripting extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 3403011209340957215L;

  /**
   * The graph panel whose scripting dialog is shown.
   */
  private final CGraphPanel m_graphPanel;

  /**
   * Creates a new action object.
   *
   * @param graphPanel The graph panel whose scripting dialog is shown.
   */
  public CActionGraphScripting(final CGraphPanel graphPanel) {
    super("New Scripting Window");

    m_graphPanel = graphPanel;
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    m_graphPanel.getDialogs().showScriptingDialog();
  }
}
