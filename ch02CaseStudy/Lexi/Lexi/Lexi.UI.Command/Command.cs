using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lexi.Lexi.UI.Command
{
    public class Command
    {
        public virtual void Execute()
        {
        }
        public virtual void UnExecute()
        {
        }
        public virtual bool Reversible()
        {
            return true;
        }
    }
}
