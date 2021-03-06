/* This Source Code Form is subject to the terms of the Mozilla Public
   License, v. 2.0. If a copy of the MPL was not distributed with this
   file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.settings.logins

/**
 * Interactor for the saved logins screen
 * Provides implementations for the SavedLoginsViewInteractor
 */
class SavedLoginsInteractor(
    private val savedLoginsController: SavedLoginsController,
    private val itemClicked: (SavedLoginsItem) -> Unit,
    private val learnMore: () -> Unit
) : SavedLoginsViewInteractor {
    override fun itemClicked(item: SavedLoginsItem) {
        itemClicked.invoke(item)
    }
    override fun onLearnMore() {
        learnMore.invoke()
    }

    override fun sort(sortingStrategy: SortingStrategy) {
        savedLoginsController.handleSort(sortingStrategy)
    }
}
