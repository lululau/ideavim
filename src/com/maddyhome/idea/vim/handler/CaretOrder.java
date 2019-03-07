/*
 * IdeaVim - Vim emulator for IDEs based on the IntelliJ platform
 * Copyright (C) 2003-2019 The IdeaVim authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.maddyhome.idea.vim.handler;

import com.intellij.openapi.editor.CaretModel;

/**
 * This represents the order in which carets are given to the handlers.
 */
public enum CaretOrder {
  /**
   * Native order in which carets are given in {@link CaretModel#getAllCarets()}
   */
  NATIVE,

  /**
   * Carets are ordered by offset, increasing
   */
  INCREASING_OFFSET,

  /**
   * Carets are ordered by offset, decreasing
   */
  DECREASING_OFFSET
}
