package spec.concordion.ext.collapse.usage;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.collapse.CollapseOutputExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

import spec.concordion.ext.collapse.AbstractCollapseFixture;

@RunWith(ConcordionRunner.class)
@Extensions(CollapseOutputExtension.class)
public class UsageFixture extends AbstractCollapseFixture {
	public boolean returnTrue() {
		return true;
	}
}
