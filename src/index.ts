import { registerPlugin } from '@capacitor/core';

import type { PrintVPlugin } from './definitions';

const PrintV = registerPlugin<PrintVPlugin>('PrintV', {
  web: () => import('./web').then(m => new m.PrintVWeb()),
});

export * from './definitions';
export { PrintV };
