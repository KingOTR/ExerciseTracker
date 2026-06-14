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

/* compiled from: Linksimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LinkSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLinkSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_linkSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinksimpleKt {
    private static ImageVector _linkSimple;

    public static final ImageVector getLinkSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _linkSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LinkSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(162.84f, 93.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 162.84f, 93.16f);
        pathBuilder.close();
        pathBuilder.moveTo(212.79f, 43.21f);
        pathBuilder.arcToRelative(52.07f, 52.07f, 0.0f, false, false, -73.56f, 0.0f);
        pathBuilder.lineTo(109.17f, 73.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 5.66f);
        pathBuilder.lineToRelative(30.07f, -30.06f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.24f, 62.24f);
        pathBuilder.lineToRelative(-30.07f, 30.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(30.07f, -30.06f);
        pathBuilder.arcTo(52.07f, 52.07f, 0.0f, false, false, 212.79f, 43.21f);
        pathBuilder.close();
        pathBuilder.moveTo(141.17f, 177.06f);
        pathBuilder.lineToRelative(-30.06f, 30.07f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -62.24f, -62.24f);
        pathBuilder.lineToRelative(30.06f, -30.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f);
        pathBuilder.lineTo(43.21f, 139.23f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 73.56f, 73.56f);
        pathBuilder.lineToRelative(30.06f, -30.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _linkSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
