package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bookopentext.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BookOpenText", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBookOpenText", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bookOpenText", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookopentextKt {
    private static ImageVector _bookOpenText;

    public static final ImageVector getBookOpenText(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bookOpenText;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BookOpenText", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 52.0f);
        pathBuilder.lineTo(160.0f, 52.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -32.0f, 19.54f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 96.0f, 52.0f);
        pathBuilder.lineTo(24.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(20.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(96.0f, 204.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(236.0f, 56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 196.0f);
        pathBuilder.lineTo(28.0f, 196.0f);
        pathBuilder.lineTo(28.0f, 60.0f);
        pathBuilder.lineTo(96.0f, 60.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f);
        pathBuilder.lineTo(124.0f, 209.4f);
        pathBuilder.arcTo(35.94f, 35.94f, 0.0f, false, false, 96.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 196.0f);
        pathBuilder.lineTo(160.0f, 196.0f);
        pathBuilder.arcToRelative(35.94f, 35.94f, 0.0f, false, false, -28.0f, 13.41f);
        pathBuilder.lineTo(132.0f, 88.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(160.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(160.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(160.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bookOpenText = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
